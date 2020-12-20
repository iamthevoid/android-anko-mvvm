@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.viewpager

import androidx.viewpager.widget.ViewPager

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


fun ViewPager.setAdapter(adapter: io.reactivex.Flowable<out androidx.viewpager.widget.PagerAdapter>) = 
	addSetter(adapter) { this.setAdapter(it) }

fun ViewPager.setCurrentItem(currentItem: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(currentItem) { this.setCurrentItem(it) }

@Deprecated("Deprecated in Java")
fun ViewPager.setOnPageChangeListener(onPageChangeListener: io.reactivex.Flowable<out androidx.viewpager.widget.ViewPager.OnPageChangeListener>) = 
	addSetter(onPageChangeListener) { this.setOnPageChangeListener(it) }

fun ViewPager.setOffscreenPageLimit(offscreenPageLimit: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(offscreenPageLimit) { this.setOffscreenPageLimit(it) }

fun ViewPager.setPageMargin(pageMargin: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(pageMargin) { this.setPageMargin(it) }

fun ViewPager.setPageMarginDrawable(pageMarginDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(pageMarginDrawable) { this.setPageMarginDrawable(it) }

fun ViewPager.setPageMarginDrawableResource(pageMarginDrawable: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(pageMarginDrawable) { this.setPageMarginDrawable(it) }