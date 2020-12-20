@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.progressbar

import android.widget.ProgressBar

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


@RequiresApi(26)
fun ProgressBar.setMin(min: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(min) { this.setMin(it) }

fun ProgressBar.setMax(max: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(max) { this.setMax(it) }

@RequiresApi(29)
fun ProgressBar.setMinWidth(minWidth: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minWidth) { this.setMinWidth(it) }

@RequiresApi(29)
fun ProgressBar.setMaxWidth(maxWidth: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxWidth) { this.setMaxWidth(it) }

@RequiresApi(29)
fun ProgressBar.setMinHeight(minHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minHeight) { this.setMinHeight(it) }

@RequiresApi(29)
fun ProgressBar.setMaxHeight(maxHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxHeight) { this.setMaxHeight(it) }

fun ProgressBar.setIndeterminate(indeterminate: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(indeterminate) { this.setIndeterminate(it) }

fun ProgressBar.setIndeterminateDrawable(indeterminateDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(indeterminateDrawable) { this.setIndeterminateDrawable(it) }

@RequiresApi(21)
fun ProgressBar.setIndeterminateTintList(indeterminateTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(indeterminateTintList) { this.setIndeterminateTintList(it) }

fun ProgressBar.setProgress(progress: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(progress) { this.setProgress(it) }

@RequiresApi(21)
fun ProgressBar.setIndeterminateTintMode(indeterminateTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(indeterminateTintMode) { this.setIndeterminateTintMode(it) }

@RequiresApi(29)
fun ProgressBar.setIndeterminateTintBlendMode(indeterminateTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(indeterminateTintBlendMode) { this.setIndeterminateTintBlendMode(it) }

@RequiresApi(21)
fun ProgressBar.setIndeterminateDrawableTiled(indeterminateDrawableTiled: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(indeterminateDrawableTiled) { this.setIndeterminateDrawableTiled(it) }

fun ProgressBar.setProgressDrawable(progressDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(progressDrawable) { this.setProgressDrawable(it) }

@RequiresApi(21)
fun ProgressBar.setProgressTintList(progressTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(progressTintList) { this.setProgressTintList(it) }

@RequiresApi(21)
fun ProgressBar.setProgressTintMode(progressTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(progressTintMode) { this.setProgressTintMode(it) }

@RequiresApi(29)
fun ProgressBar.setProgressTintBlendMode(progressTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(progressTintBlendMode) { this.setProgressTintBlendMode(it) }

@RequiresApi(21)
fun ProgressBar.setProgressBackgroundTintList(progressBackgroundTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(progressBackgroundTintList) { this.setProgressBackgroundTintList(it) }

@RequiresApi(21)
fun ProgressBar.setProgressBackgroundTintMode(progressBackgroundTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(progressBackgroundTintMode) { this.setProgressBackgroundTintMode(it) }

@RequiresApi(29)
fun ProgressBar.setProgressBackgroundTintBlendMode(progressBackgroundTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(progressBackgroundTintBlendMode) { this.setProgressBackgroundTintBlendMode(it) }

@RequiresApi(21)
fun ProgressBar.setSecondaryProgressTintList(secondaryProgressTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(secondaryProgressTintList) { this.setSecondaryProgressTintList(it) }

@RequiresApi(21)
fun ProgressBar.setSecondaryProgressTintMode(secondaryProgressTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(secondaryProgressTintMode) { this.setSecondaryProgressTintMode(it) }

@RequiresApi(29)
fun ProgressBar.setSecondaryProgressTintBlendMode(secondaryProgressTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(secondaryProgressTintBlendMode) { this.setSecondaryProgressTintBlendMode(it) }

@RequiresApi(21)
fun ProgressBar.setProgressDrawableTiled(progressDrawableTiled: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(progressDrawableTiled) { this.setProgressDrawableTiled(it) }

fun ProgressBar.setSecondaryProgress(secondaryProgress: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(secondaryProgress) { this.setSecondaryProgress(it) }

fun ProgressBar.setInterpolator(interpolator: io.reactivex.Flowable<out android.view.animation.Interpolator>) = 
	addSetter(interpolator) { this.setInterpolator(it) }