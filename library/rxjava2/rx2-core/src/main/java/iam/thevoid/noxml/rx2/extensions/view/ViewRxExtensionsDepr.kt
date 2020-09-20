@file:Suppress("DeprecatedCallableAddReplaceWith", "DEPRECATION")

package iam.thevoid.noxml.rx2.extensions.view

import android.os.Build
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.view.ViewTreeObserver
import iam.thevoid.ae.setClickable
import iam.thevoid.noxml.change.scroll.OnFling
import iam.thevoid.noxml.change.scroll.OnScroll
import iam.thevoid.noxml.core.local.extensions.view.gestureDetector
import iam.thevoid.noxml.core.local.extensions.view.gestureDetectorCallback
import iam.thevoid.noxml.core.local.extensions.view.onGlobalLayoutDelegate
import iam.thevoid.noxml.rx2.data.fields.*
import iam.thevoid.noxml.util.containsInStackTrace
import iam.thevoid.util.Optional

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.hideUntilLoaded(loading: RxBoolean) =
    hideUntilLoaded(loading.observe())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.hideWhenLoaded(loading: RxBoolean) =
    hideWhenLoaded(loading.observe())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.goneUntilLoaded(loading: RxBoolean) =
    goneUntilLoaded(loading.observe())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.goneWhenLoaded(loading: RxBoolean) =
    goneWhenLoaded(loading.observe())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.gone(needGone: RxField<Boolean>) =
    gone(needGone.onlyPresent())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.gone(needGone: RxItem<Boolean>) =
    gone(needGone.observe())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.hide(needHide: RxField<Boolean>) =
    hide(needHide.onlyPresent())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.hide(needHide: RxItem<Boolean>) =
    hide(needHide.observe())

//@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
//fun View.setAlpha(alpha: RxField<Float>) =
//    setAlpha(alpha.onlyPresent())
//
//@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
//fun View.setAlpha(alpha: RxItem<Float>) =
//    setAlpha(alpha.observe())


@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onFocusChange(onFocusChange: RxItem<Boolean>) =
    onFocusChange(onFocusChange) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onFocusChange(onFocusChange: RxField<Boolean>) =
    onFocusChange(onFocusChange) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onFocusChange(onFocusChange: RxField<T>, mapper: (Boolean) -> T?) {
    onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus -> onFocusChange.set(mapper(hasFocus)) }
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onFocusChange(onFocusChange: RxItem<T>, mapper: (Boolean) -> T) {
    onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus -> onFocusChange.set(mapper(hasFocus)) }
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onFocusChangeForceFalseOnClearFocus(onFocusChange: RxBoolean) =
    onFocusChangeForceFalseOnClearFocus(onFocusChange) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onFocusChangeForceFalseOnClearFocus(onFocusChange: RxItem<Boolean>) =
    onFocusChangeForceFalseOnClearFocus(onFocusChange) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onFocusChangeForceFalseOnClearFocus(
    onFocusChange: RxItem<T>,
    mapper: (Boolean) -> T
) {
    onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
        onFocusChange.set(
            mapper(
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P && hasFocus) {
                    if (containsInStackTrace("clearFocus")) false else hasFocus
                } else hasFocus
            )
        )
    }
}

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.setTranslationY(translation: RxField<Float>) =
    setTranslationY(translation.onlyPresent())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.setTranslationY(translation: RxItem<Float>) =
    setTranslationY(translation.observe())

@Deprecated("Fields and Items will be removed in release version, use realization with Flowable instead")
fun View.setTranslationY(translation: RxFloat) =
    setTranslationY(translation.observe())

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
@Suppress("ObjectLiteralToLambda", "DEPRECATION")
fun View.getHeight(height: RxInt) {
    onGlobalLayoutDelegate.addOnGlobalLayoutCallback(object :
        ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            height.set(measuredHeight)
        }
    })
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onScroll(onScroll: RxField<T>, mapper: (OnScroll) -> T) {
    gestureDetectorCallback.addOnScrollCallback(object :
        GestureDetector.SimpleOnGestureListener() {
        override fun onScroll(
            e1: MotionEvent?,
            e2: MotionEvent?,
            distanceX: Float,
            distanceY: Float
        ): Boolean {
            onScroll.set(mapper(OnScroll(e1, e2, distanceX, distanceY)))
            return true
        }
    })
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onScroll(onScroll: RxField<OnScroll>) =
    onScroll(onScroll) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onFling(onFling: RxField<T>, mapper: (OnFling) -> T) {
    gestureDetectorCallback.addOnFlingCallback(object :
        GestureDetector.SimpleOnGestureListener() {
        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent?,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            onFling.set(mapper(OnFling(e1, e2, velocityX, velocityY)))
            return true
        }
    })
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onFling(onFling: RxField<OnFling>) =
    onFling(onFling) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onDown(onDown: RxField<T>, mapper: (Optional<MotionEvent>) -> T) {
    gestureDetectorCallback.addOnDownCallback(object :
        GestureDetector.SimpleOnGestureListener() {
        override fun onDown(e: MotionEvent?): Boolean {
            onDown.set(mapper(Optional.of(e)))
            return true
        }
    })
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onDown(onDown: RxField<Optional<MotionEvent>>) =
    onDown(onDown) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onSingleTapUp(
    onSingleTapUp: RxField<T>,
    mapper: (Optional<MotionEvent>) -> T
) {
    gestureDetectorCallback.addOnSingleTapUpCallback(object :
        GestureDetector.SimpleOnGestureListener() {
        override fun onSingleTapUp(e: MotionEvent?): Boolean {
            onSingleTapUp.set(mapper(Optional.of(e)))
            return true
        }
    })
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onSingleTapUp(onSingleTapUp: RxField<Optional<MotionEvent>>) =
    onSingleTapUp(onSingleTapUp) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onShowPress(onShowPress: RxField<T>, mapper: (Optional<MotionEvent>) -> T) {
    gestureDetectorCallback.addOnShowPressCallback(object :
        GestureDetector.SimpleOnGestureListener() {
        override fun onShowPress(e: MotionEvent?) = onShowPress.set(mapper(Optional.of(e)))
    })
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onShowPress(onShowPress: RxField<Optional<MotionEvent>>) =
    onShowPress(onShowPress) { it }

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun <T : Any> View.onLongPress(onLongPress: RxField<T>, mapper: (Optional<MotionEvent>) -> T) {
    gestureDetectorCallback.addOnShowPressCallback(object :
        GestureDetector.SimpleOnGestureListener() {
        override fun onShowPress(e: MotionEvent?) = onLongPress.set(mapper(Optional.of(e)))
    })
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

@Deprecated("Fields and Items will be removed in release version, use realization with FlowableProcessor instead")
fun View.onLongPress(onLongPress: RxField<Optional<MotionEvent>>) =
    onLongPress(onLongPress) { it }