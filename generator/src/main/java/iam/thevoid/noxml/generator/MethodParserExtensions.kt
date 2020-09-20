package iam.thevoid.noxml.generator

import sun.reflect.generics.tree.*
import kotlin.reflect.KClass
import kotlin.reflect.KTypeProjection
import kotlin.reflect.full.createType

fun TypeSignature.kClass() : KClass<*> =
    canBeKClass()

fun ReturnType.kClass() : KClass<*> =
    canBeKClass()

fun FieldTypeSignature.kClass() : KClass<*> =
    canBeKClass()

fun FormalTypeParameter.kClass() : KClass<*> =
    canBeKClass()

private fun <T> T.canBeKClass() : KClass<*> =
    when(this) {
        is ClassTypeSignature -> Class.forName(path.first().name).kotlin
        is ArrayTypeSignature -> Array::class.createType(arguments = listOf(KTypeProjection.invariant(this@canBeKClass.componentType.kClass().createType()))).classifier as KClass<*>
        is VoidDescriptor -> Void::class
        is BooleanSignature -> Boolean::class
        is IntSignature -> Int::class
        is LongSignature -> Long::class
        is ByteSignature -> Byte::class
        is ShortSignature -> Short::class
        is FloatSignature -> Float::class
        is DoubleSignature -> Double::class
        else -> throw NotImplementedError("Branch for $this not implemented")
    }