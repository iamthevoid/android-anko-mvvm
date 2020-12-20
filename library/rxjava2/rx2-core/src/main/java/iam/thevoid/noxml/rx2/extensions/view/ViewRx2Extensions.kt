@file:Suppress("unused")

package iam.thevoid.noxml.rx2.extensions.view

import android.os.Build
import android.view.*
import iam.thevoid.ae.*
import iam.thevoid.e.mergeWith
import iam.thevoid.noxml.change.Margins
import iam.thevoid.noxml.change.scroll.OnFling
import iam.thevoid.noxml.change.scroll.OnScroll
import iam.thevoid.noxml.core.local.extensions.view.gestureDetector
import iam.thevoid.noxml.core.local.extensions.view.gestureDetectorCallback
import iam.thevoid.noxml.core.local.extensions.view.onGlobalLayoutDelegate
import iam.thevoid.noxml.core.local.extensions.view.settersCache
import iam.thevoid.noxml.rx2.data.RxLoading
import iam.thevoid.noxml.rx2.utils.RxSetter
import iam.thevoid.noxml.util.containsInStackTrace
import iam.thevoid.util.Optional
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.processors.FlowableProcessor
import io.reactivex.rxkotlin.Flowables

fun <T : Any, V : View> V.addSetter(flowable: Flowable<T>, setter: V.(T) -> Unit = {}) {
    settersCache.apply {
        subscribeSetter(object : RxSetter<V, T>(this@addSetter, flowable) {
            override fun set(view: V?, component: T) {
                view?.apply { setter(this, component) }
            }
        })
    }
}

/**
 * Enabled
 */

fun View.disableWhileLoading(loading: RxLoading) =
    addSetter(loading.observe()) { isEnabled = !it }

fun View.enableWhileLoading(loading: RxLoading) =
    addSetter(loading.observe()) { isEnabled = it }

/**
 * Margin
 */

fun View.setLeftMargin(leftMargin: Flowable<Int>) = setMargins(left = leftMargin)

fun View.setTopMargin(topMargin: Flowable<Int>) = setMargins(top = topMargin)

fun View.setRightMargin(rightMargin: Flowable<Int>) = setMargins(right = rightMargin)

fun View.setBottomMargin(bottomMargin: Flowable<Int>) = setMargins(bottom = bottomMargin)

fun View.setMargins(
    left: Flowable<Int> = Flowable.just(marginLeft),
    top: Flowable<Int> = Flowable.just(marginTop),
    right: Flowable<Int> = Flowable.just(marginRight),
    bottom: Flowable<Int> = Flowable.just(marginBottom)
) = addSetter(Flowables.combineLatest(left, top, right, bottom) { l, t, r, b ->
    Margins(l, t, r, b)
}) { margins ->
        (layoutParams as? ViewGroup.MarginLayoutParams)
            ?.setMargins(margins.left, margins.top, margins.right, margins.bottom)
    }

/**
 * Visibility
 */


fun View.hideUntilLoaded(loading: Flowable<Boolean>) =
    addSetter(loading) { hide(it) }

fun View.hideUntilLoaded(loading: RxLoading) =
    hideUntilLoaded(loading.observe())

fun View.hideUntilLoaded(loading: RxLoading, vararg loadings: RxLoading) =
    hideUntilLoaded(Flowable.merge(loading.observe().mergeWith(loadings.map { it.observe() })))

fun View.hideWhenLoaded(loading: Flowable<Boolean>) =
    addSetter(loading) { hide(!it) }

fun View.hideWhenLoaded(loading: RxLoading) =
    hideWhenLoaded(loading.observe())

fun View.hideWhenLoaded(loading: RxLoading, vararg loadings: RxLoading) =
    hideWhenLoaded(Flowable.merge(loading.observe().mergeWith(loadings.map { it.observe() })))

fun View.hideWhenLoaded(loading: Flowable<Boolean>, vararg loadings: Flowable<Boolean>) =
    hideWhenLoaded(Flowable.merge(loading.mergeWith(loadings.toList())))

fun View.goneUntilLoaded(loading: Flowable<Boolean>) =
    addSetter(loading) { gone(it) }

fun View.goneUntilLoaded(loading: RxLoading) =
    goneUntilLoaded(loading.observe())

fun View.goneUntilLoaded(loading: RxLoading, vararg loadings: RxLoading) =
    goneUntilLoaded(Flowable.merge(loading.observe().mergeWith(loadings.map { it.observe() })))

fun View.goneWhenLoaded(loading: Flowable<Boolean>) =
    addSetter(loading) { gone(!it) }

fun View.goneWhenLoaded(loading: RxLoading) =
    goneWhenLoaded(loading.observe())

fun View.goneWhenLoaded(loading: RxLoading, vararg loadings: RxLoading) =
    goneWhenLoaded(Flowable.merge(loading.observe().mergeWith(loadings.map { it.observe() })))

fun View.gone(needGone: Flowable<Boolean>) =
    addSetter(needGone) { gone(it) }

fun View.hide(needHide: Flowable<Boolean>) =
    addSetter(needHide) { hide(it) }

/**
 * Color
 */

fun View.setBackgroundColorResource(color: Flowable<Int>) =
    addSetter(color) { setBackgroundColor(color(it)) }

/**
 * On click listener
 */

fun View.setClickListener(onClick: Flowable<View.OnClickListener>) =
    addSetter(onClick) {
        setOnClickListener(null)
        setOnClickListener(it)
    }

/**
 * Focus
 */

fun View.onFocusChange(onFocusChange: FlowableProcessor<Boolean>) =
    onFocusChange(onFocusChange, mapper = { it })

fun <T : Any> View.onFocusChange(onFocusChange: FlowableProcessor<T>, mapper: (Boolean) -> T) {
    addSetter(Flowable.create<T>({
        onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            it.onNext(mapper(hasFocus))
        }
        it.setCancellable { onFocusChangeListener = null }
    }, BackpressureStrategy.LATEST).doOnNext(onFocusChange::onNext))
}

fun <T : Any> View.onFocusChangeForceFalseOnClearFocus(
    onFocusChange: FlowableProcessor<T>,
    mapper: (Boolean) -> T
) {
    addSetter(Flowable.create<T>({
        onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            it.onNext(
                mapper(
                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P && hasFocus) {
                        if (containsInStackTrace("clearFocus")) false else hasFocus
                    } else hasFocus
                )
            )
        }
        it.setCancellable { onFocusChangeListener = null }
    }, BackpressureStrategy.LATEST).doOnNext(onFocusChange::onNext))
}

/**
 * Height
 */

fun View.getHeight(height: FlowableProcessor<Int>) {
    addSetter(Flowable.create<Int>({
        val callback = ViewTreeObserver.OnGlobalLayoutListener { it.onNext(measuredHeight) }
        onGlobalLayoutDelegate.addOnGlobalLayoutCallback(callback)
        it.setCancellable { onGlobalLayoutDelegate.removeOnGlobalLayoutCallback(callback) }
    }, BackpressureStrategy.LATEST).doOnNext(height::onNext))
}

/**
 * onScroll
 */

fun <T : Any> View.onScroll(onScroll: FlowableProcessor<T>, mapper: (OnScroll) -> T) {
    addSetter(Flowable.create<T>({
        val callback = object :
            GestureDetector.SimpleOnGestureListener() {
            override fun onScroll(
                e1: MotionEvent?,
                e2: MotionEvent?,
                distanceX: Float,
                distanceY: Float
            ): Boolean {
                it.onNext(mapper(OnScroll(e1, e2, distanceX, distanceY)))
                return true
            }
        }
        gestureDetectorCallback.addOnScrollCallback(callback)
        it.setCancellable { gestureDetectorCallback.removeOnScrollCallback(callback) }
    }, BackpressureStrategy.LATEST).doOnNext(onScroll::onNext))
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

fun View.onScroll(onScroll: FlowableProcessor<OnScroll>) =
    onScroll(onScroll) { it }

/**
 * onFling
 */

fun <T : Any> View.onFling(onFling: FlowableProcessor<T>, mapper: (OnFling) -> T) {
    addSetter(Flowable.create<T>({
        val callback = object :
            GestureDetector.SimpleOnGestureListener() {
            override fun onFling(
                e1: MotionEvent?,
                e2: MotionEvent?,
                velocityX: Float,
                velocityY: Float
            ): Boolean {
                it.onNext(mapper(OnFling(e1, e2, velocityX, velocityY)))
                return true
            }
        }
        gestureDetectorCallback.addOnFlingCallback(callback)
        it.setCancellable { gestureDetectorCallback.removeOnFlingCallback(callback) }
    }, BackpressureStrategy.LATEST).doOnNext(onFling::onNext))
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

fun View.onFling(onFling: FlowableProcessor<OnFling>) =
    onFling(onFling) { it }

/**
 * onDown
 */

fun <T : Any> View.onDown(onDown: FlowableProcessor<T>, mapper: (Optional<MotionEvent>) -> T) {
    addSetter(Flowable.create<T>({
        val callback = object :
            GestureDetector.SimpleOnGestureListener() {
            override fun onDown(e: MotionEvent?): Boolean {
                it.onNext(mapper(Optional.of(e)))
                return true
            }
        }
        gestureDetectorCallback.addOnDownCallback(callback)
        it.setCancellable { gestureDetectorCallback.removeOnDownCallback(callback) }
    }, BackpressureStrategy.LATEST).doOnNext(onDown::onNext))
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

fun View.onDown(onDown: FlowableProcessor<Optional<MotionEvent>>) =
    onDown(onDown) { it }

/**
 * onSingleTapUp
 */

fun <T : Any> View.onSingleTapUp(
    onSingleTapUp: FlowableProcessor<T>,
    mapper: (Optional<MotionEvent>) -> T
) {
    addSetter(Flowable.create<T>({
        val callback = object :
            GestureDetector.SimpleOnGestureListener() {
            override fun onSingleTapUp(e: MotionEvent?): Boolean {
                it.onNext(mapper(Optional.of(e)))
                return true
            }
        }
        gestureDetectorCallback.addOnSingleTapUpCallback(callback)
        it.setCancellable { gestureDetectorCallback.removeOnSingleTapUpCallback(callback) }
    }, BackpressureStrategy.LATEST).doOnNext(onSingleTapUp::onNext))
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

fun View.onSingleTapUp(onSingleTapUp: FlowableProcessor<Optional<MotionEvent>>) =
    onSingleTapUp(onSingleTapUp) { it }

/**
 * onShowPress
 */

fun <T : Any> View.onShowPress(
    onShowPress: FlowableProcessor<T>,
    mapper: (Optional<MotionEvent>) -> T
) {
    addSetter(Flowable.create<T>({
        val callback = object : GestureDetector.SimpleOnGestureListener() {
            override fun onShowPress(e: MotionEvent?) = it.onNext(mapper(Optional.of(e)))
        }
        gestureDetectorCallback.addOnShowPressCallback(callback)
        it.setCancellable { gestureDetectorCallback.removeOnShowPressCallback(callback) }
    }, BackpressureStrategy.LATEST).doOnNext(onShowPress::onNext))
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

fun View.onShowPress(onShowPress: FlowableProcessor<Optional<MotionEvent>>) =
    onShowPress(onShowPress) { it }

/**
 * onLongPress
 */

fun <T : Any> View.onLongPress(onLongPress: FlowableProcessor<T>, mapper: (Optional<MotionEvent>) -> T) {
    addSetter(Flowable.create<T>({
        val callback = object : GestureDetector.SimpleOnGestureListener() {
            override fun onShowPress(e: MotionEvent?) = it.onNext(mapper(Optional.of(e)))
        }
        gestureDetectorCallback.addOnShowPressCallback(callback)
        it.setCancellable { gestureDetectorCallback.removeOnLongPressCallback(callback) }
    }, BackpressureStrategy.LATEST).doOnNext(onLongPress::onNext))
    setOnTouchListener { _, event -> gestureDetector.onTouchEvent(event) }
    setClickable()
}

fun View.onLongPress(onLongPress: FlowableProcessor<Optional<MotionEvent>>) =
    onLongPress(onLongPress) { it }