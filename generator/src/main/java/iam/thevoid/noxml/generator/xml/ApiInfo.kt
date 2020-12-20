package iam.thevoid.noxml.generator.xml

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import iam.thevoid.noxml.generator.kClass
import iam.thevoid.noxml.generator.xml.model.Api
import iam.thevoid.noxml.generator.xml.model.MethodDescription
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.jvm.javaMethod

object ApiInfo {

    private const val SDK_PATH_ENV = "ANDROID_HOME"
    private const val XML_FILE_PATH = "platform-tools/api/api-versions.xml"

    val api: Api by lazy {
        File(System.getenv(SDK_PATH_ENV), XML_FILE_PATH)
            .readText()
            .let { apiDescContents -> XmlMapper().readValue(apiDescContents, Api::class.java) }
    }

    fun sameNameMethods(function: KFunction<*>, className: String) =
        function.javaMethod?.let { method ->
            api.classes
                .find { apiClass ->
                    apiClass.simpleName == className &&
                            apiClass.methods.any { apiMethod ->
                                apiMethod.name == method.name
                            }
                }
                ?.methods
                ?.filter { apiMethod -> apiMethod.name == method.name }
        }.orEmpty()

    fun similarSingleParamMethod(function: KFunction<*>, className: String): MethodDescription? {
        val param = function.parameters[1]
        val paramKClass = param.type.classifier as? KClass<*>
        return sameNameMethods(function, className)
            .find { apiMethod ->
                val signature = apiMethod.signature
                signature.parameterTypes.size == 1 &&
                        signature.parameterTypes.first().kClass()
                            .qualifiedName == paramKClass?.qualifiedName
            }
    }

}