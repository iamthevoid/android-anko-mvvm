package iam.thevoid.noxml.generator

import android.view.View
import android.widget.*
import androidx.appcompat.widget.ActionBarContainer
import androidx.viewpager.widget.ViewPager
import kotlin.reflect.KClass

data class Mapping(val artifact: String, val handlingClasses: List<KClass<out View>>) {
    companion object {
        val mappings = listOf(
            Mapping(
                artifact = "core", handlingClasses = listOf(
                    View::class,
                    AbsSeekBar::class,
                    AbsSpinner::class,
                    ActionBarContainer::class,
                    TextView::class,
                    ImageView::class,
                    ProgressBar::class,
                    ViewPager::class
                )
            ),
        )
    }
}
