@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.absseekbar

import android.widget.AbsSeekBar

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


fun AbsSeekBar.setSystemGestureExclusionRects(systemGestureExclusionRects: io.reactivex.Flowable<out kotlin.collections.List<out android.graphics.Rect>>) = 
	addSetter(systemGestureExclusionRects) { this.setSystemGestureExclusionRects(it) }

fun AbsSeekBar.setMin(min: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(min) { this.setMin(it) }

fun AbsSeekBar.setMax(max: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(max) { this.setMax(it) }

@RequiresApi(24)
fun AbsSeekBar.setTickMark(tickMark: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(tickMark) { this.setTickMark(it) }

@RequiresApi(24)
fun AbsSeekBar.setTickMarkTintList(tickMarkTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(tickMarkTintList) { this.setTickMarkTintList(it) }

@RequiresApi(24)
fun AbsSeekBar.setTickMarkTintMode(tickMarkTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(tickMarkTintMode) { this.setTickMarkTintMode(it) }

@RequiresApi(29)
fun AbsSeekBar.setTickMarkTintBlendMode(tickMarkTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(tickMarkTintBlendMode) { this.setTickMarkTintBlendMode(it) }

fun AbsSeekBar.setKeyProgressIncrement(keyProgressIncrement: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(keyProgressIncrement) { this.setKeyProgressIncrement(it) }

fun AbsSeekBar.setThumb(thumb: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(thumb) { this.setThumb(it) }

@RequiresApi(21)
fun AbsSeekBar.setThumbTintList(thumbTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(thumbTintList) { this.setThumbTintList(it) }

@RequiresApi(21)
fun AbsSeekBar.setThumbTintMode(thumbTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(thumbTintMode) { this.setThumbTintMode(it) }

@RequiresApi(29)
fun AbsSeekBar.setThumbTintBlendMode(thumbTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(thumbTintBlendMode) { this.setThumbTintBlendMode(it) }

fun AbsSeekBar.setThumbOffset(thumbOff: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(thumbOff) { this.setThumbOffset(it) }

@RequiresApi(21)
fun AbsSeekBar.setSplitTrack(splitTrack: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(splitTrack) { this.setSplitTrack(it) }