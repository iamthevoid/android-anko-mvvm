package iam.thevoid.noxml.generator

import android.view.View
import android.widget.TextView
import kotlin.reflect.KClass

data class Mapping(val artifact: String, val handlingClasses: List<KClass<out View>>) {
    companion object {
        val mappings = listOf(
            Mapping(
                artifact = "core", handlingClasses = listOf(
                    View::class
                )
            ),
        )
    }
}
