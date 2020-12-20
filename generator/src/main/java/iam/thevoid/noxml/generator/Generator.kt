package iam.thevoid.noxml.generator

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.view.View
import androidx.annotation.RestrictTo
import iam.thevoid.e.safe
import iam.thevoid.noxml.generator.xml.ApiInfo
import iam.thevoid.noxml.generator.xml.model.MethodDescription
import java.io.File
import java.lang.reflect.Modifier
import java.util.*
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.jvm.javaMethod

private const val ROOT_FOLDER = "."
private const val SRC_PATH = "src/main/java"
private const val LIB_PATH = "library"
private const val EXT_PATH = "extensions"

private const val PKG_PATH_SEPARATOR = "."
private const val PACKAGE = "iam${PKG_PATH_SEPARATOR}thevoid${PKG_PATH_SEPARATOR}noxml"

fun main() {
    Mapping.mappings.forEach { (artifact, viewClasses) ->
        viewClasses.forEach { viewClass ->
            println("\nGenerate extensions for $viewClass ...")
            generateExtensionFile(artifact, viewClass)
        }
    }
}

@SuppressLint("NewApi")
private fun generateExtensionFile(artifact: String, viewClass: KClass<out View>) {
    val className = viewClass
        .takeIf { it.simpleName?.isNotBlank().safe() }
        ?.simpleName
        ?: return

    Library.realizations
        .forEach { (name, pathPrefix, streamClass) ->

        println("Artifact name: $name")
        println("Stream class: $streamClass")
        println("Path prefix: $pathPrefix")

        val viewExtensionsPackage =
            listOf(PACKAGE, pathPrefix, EXT_PATH, className.toLowerCase(Locale.getDefault()))
                .joinToString(separator = PKG_PATH_SEPARATOR)

        val pathToViewExtensions = path(
            LIB_PATH, name, "$pathPrefix-$artifact", SRC_PATH,
            *viewExtensionsPackage.split(PKG_PATH_SEPARATOR).toTypedArray()
        )

        println("Path: $pathToViewExtensions")

        val viewDir = File(ROOT_FOLDER, pathToViewExtensions)
        if (!viewDir.exists()) {
            viewDir.mkdirs()
        }

        val generatedFileName =
            "$className${pathPrefix.capitalize(Locale.getDefault())}Extensions_generated.kt"

        val libraryExtensionsClass = libraryExtensionsClass(pathPrefix, className)

        println("Extensions filename: $generatedFileName")

        File(viewDir, generatedFileName).apply {

            println("Removing old file version... ${delete()}")
            println("Creating new file version... ${createNewFile()}")
            println("Created file $absolutePath")

            bufferedWriter().use { out ->
                out.write(
                    """
                    @file:Suppress(
                    	"unused", 
                    	"UsePropertyAccessSyntax", 
                    	"RemoveRedundantQualifierName", 
                    	"UnusedImport",
                    	"DeprecatedCallableAddReplaceWith",
                        "DEPRECATION"
                    )
                """.trimIndent()
                )

                println("Created file level rules")

                out.write("\n\n")
                out.write("package $viewExtensionsPackage\n\n")
                out.write("import ${viewClass.qualifiedName}\n\n")
                out.write("import ${streamClass}\n")
                out.write("import iam.thevoid.noxml.${pathPrefix}.extensions.view.addSetter\n")
                out.write("import androidx.annotation.RequiresApi\n")

                println("Wrote imports")

                println("\nWriting functions")


                viewClass.declaredFunctions
                    .asSequence()
                    .filter { it.name.startsWith("set") }
                    .filter { it.parameters.size == 2 }
                    .filter { it.javaMethod?.modifiers?.let(Modifier::isPublic).safe() }
                    .filter { kFunction ->
                        with(libraryExtensionsClass?.declaredMethods.orEmpty()) {
                            none {
                                it.name == kFunction.name &&
                                        it.parameters[1].parameterizedType.typeName
                                            .contains((kFunction.parameters[1].type.classifier as KClass<*>).simpleName.orEmpty())
                            }
                        }
                    }
                    .toList()
                    .also { functions ->
                        functions.forEach { kFunction ->

                            val apiMethod = ApiInfo.similarSingleParamMethod(kFunction, className)
                            val since = apiMethod?.since.safe(default = 1)
                            val sameMethodsNames = ApiInfo.sameNameMethods(kFunction, className)
                            val sameMethods = functions.filter { it.name == kFunction.name }

                            // filtered by params count
                            val kParam = kFunction.parameters[1]
                            val kParamKClass = kParam.type.classifier as? KClass<*>

                            val paramName = paramName(kFunction)
                            val streamName = streamName(streamClass, kParam)
                            val funName = functionName(sameMethodsNames, sameMethods, kParamKClass, kFunction)
                            val nativeSetterCall = setterCall(kFunction, kParam)

                            out.write("\n\n")
                            if (BuildConfig.MIN_SDK_VERSION < since) {
                                out.write("@RequiresApi($since)\n")
                            }
                            if (kFunction.annotations.any { it is java.lang.Deprecated }) {
                                out.write("@Deprecated(\"Deprecated in Java\")\n")
                            }
                            out.write("fun $className.$funName(${paramName}: $streamName) = \n")
                            out.write("\taddSetter($paramName) { $nativeSetterCall }")

                            println(funName)
                        }

                        println("\n")
                    }
            }
        }
    }
}

private fun libraryExtensionsClass(
    pathPrefix: String,
    className: String
) =
    try {
        Class.forName(
            "$PACKAGE.$pathPrefix.$EXT_PATH.${
                className.toLowerCase(Locale.getDefault())
            }.$className${
                pathPrefix.capitalize(Locale.getDefault())
            }ExtensionsKt"
        )
    } catch (ignored: Exception) {
        null
    }

private fun setterCall(kFunction: KFunction<*>, kParam: KParameter) =
    "this.${kFunction.name}(${if (kParam.isVararg) "*" else ""}it)"

private fun paramName(kFunction: KFunction<*>) = kFunction.name.replace("set", "")
    .decapitalize(Locale.getDefault())

private fun streamName(streamClass: String, param: KParameter): String {
    return "$streamClass<${param.type.asString()}>"
}

private fun KType.asString(): String =
    buildString {
        append("out ")
        append((classifier as KClass<*>).qualifiedName)
        if (arguments.isNotEmpty()) {
            append("<")
            append(arguments.joinToString(separator = ", ") { it.type!!.asString() })
            append(">")
        }
    }

/**
 * Reduce conflicts for functions with same name by adding "is" to Boolean realizations
 */
private fun functionName(
    sameMethodNames: List<MethodDescription>,
    sameMethods: List<KFunction<*>>,
    kParamKClass: KClass<*>?,
    kFunction: KFunction<*>
): String {
    return if (sameMethodNames.size > 1 || sameMethods.size > 1) {
        when {

            kParamKClass == Boolean::class ->
                kFunction.name.replace("set", "setIs")

            kParamKClass == ColorStateList::class &&
                    kFunction.name.endsWith("Color") ->
                kFunction.name.replace("Color", "ColorStateList")

            kParamKClass == Int::class &&
                    kFunction.name.endsWith("Drawable") ->
                kFunction.name.replace("Drawable", "DrawableResource")

            kParamKClass == Int::class &&
                    kFunction.name.endsWith("ColorFilter") ->
                kFunction.name.replace("ColorFilter", "ColorFilterColor")

            kParamKClass == Int::class &&
                    sameMethodNames.any { method ->
                        with(method.signature.parameterTypes.map { it.kClass() }) {
                            contains(Drawable::class) || contains(CharSequence::class)
                        }
                    } ->
                "${kFunction.name}Resource"

            kParamKClass == Int::class &&
                    sameMethodNames.any { method ->
                        with(method.signature.parameterTypes.map { it.kClass() }) {
                            contains(Drawable::class) || contains(CharSequence::class)
                        }
                    } ->
                "${kFunction.name}Resource"


            else -> kFunction.name
        }
    } else {
        kFunction.name
    }
}

private fun path(vararg parts: String) = parts.joinToString(separator = File.separator)
