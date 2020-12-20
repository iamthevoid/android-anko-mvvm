@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.imageview

import android.widget.ImageView

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


fun ImageView.setVisibility(visibility: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(visibility) { this.setVisibility(it) }

@Deprecated("Deprecated in Java")
fun ImageView.setAlpha(alpha: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(alpha) { this.setAlpha(it) }

fun ImageView.setSelected(selected: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(selected) { this.setSelected(it) }

fun ImageView.setMaxWidth(maxWidth: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxWidth) { this.setMaxWidth(it) }

fun ImageView.setMaxHeight(maxHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxHeight) { this.setMaxHeight(it) }

fun ImageView.setImageResource(imageResource: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(imageResource) { this.setImageResource(it) }

fun ImageView.setImageURI(imageURI: io.reactivex.Flowable<out android.net.Uri>) = 
	addSetter(imageURI) { this.setImageURI(it) }

fun ImageView.setAdjustViewBounds(adjustViewBounds: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(adjustViewBounds) { this.setAdjustViewBounds(it) }

fun ImageView.setImageDrawable(imageDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(imageDrawable) { this.setImageDrawable(it) }

@RequiresApi(23)
fun ImageView.setImageIcon(imageIcon: io.reactivex.Flowable<out android.graphics.drawable.Icon>) = 
	addSetter(imageIcon) { this.setImageIcon(it) }

@RequiresApi(21)
fun ImageView.setImageTintList(imageTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(imageTintList) { this.setImageTintList(it) }

@RequiresApi(21)
fun ImageView.setImageTintMode(imageTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(imageTintMode) { this.setImageTintMode(it) }

@RequiresApi(29)
fun ImageView.setImageTintBlendMode(imageTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(imageTintBlendMode) { this.setImageTintBlendMode(it) }

fun ImageView.setImageBitmap(imageBitmap: io.reactivex.Flowable<out android.graphics.Bitmap>) = 
	addSetter(imageBitmap) { this.setImageBitmap(it) }

fun ImageView.setImageLevel(imageLevel: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(imageLevel) { this.setImageLevel(it) }

fun ImageView.setScaleType(scaleType: io.reactivex.Flowable<out android.widget.ImageView.ScaleType>) = 
	addSetter(scaleType) { this.setScaleType(it) }

fun ImageView.setImageMatrix(imageMatrix: io.reactivex.Flowable<out android.graphics.Matrix>) = 
	addSetter(imageMatrix) { this.setImageMatrix(it) }

fun ImageView.setCropToPadding(cropToPadding: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(cropToPadding) { this.setCropToPadding(it) }

fun ImageView.setBaseline(baseline: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(baseline) { this.setBaseline(it) }

fun ImageView.setBaselineAlignBottom(baselineAlignBottom: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(baselineAlignBottom) { this.setBaselineAlignBottom(it) }

fun ImageView.setColorFilterColor(colorFilter: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(colorFilter) { this.setColorFilter(it) }

fun ImageView.setColorFilter(colorFilter: io.reactivex.Flowable<out android.graphics.ColorFilter>) = 
	addSetter(colorFilter) { this.setColorFilter(it) }

fun ImageView.setImageAlpha(imageAlpha: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(imageAlpha) { this.setImageAlpha(it) }