@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.view

import android.view.View

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


fun View.setFadingEdgeLength(fadingEdgeLength: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(fadingEdgeLength) { this.setFadingEdgeLength(it) }

@RequiresApi(29)
fun View.setVerticalScrollbarThumbDrawable(verticalScrollbarThumbDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(verticalScrollbarThumbDrawable) { this.setVerticalScrollbarThumbDrawable(it) }

@RequiresApi(29)
fun View.setVerticalScrollbarTrackDrawable(verticalScrollbarTrackDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(verticalScrollbarTrackDrawable) { this.setVerticalScrollbarTrackDrawable(it) }

@RequiresApi(29)
fun View.setHorizontalScrollbarThumbDrawable(horizontalScrollbarThumbDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(horizontalScrollbarThumbDrawable) { this.setHorizontalScrollbarThumbDrawable(it) }

@RequiresApi(29)
fun View.setHorizontalScrollbarTrackDrawable(horizontalScrollbarTrackDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(horizontalScrollbarTrackDrawable) { this.setHorizontalScrollbarTrackDrawable(it) }

fun View.setVerticalScrollbarPosition(verticalScrollbarPosition: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(verticalScrollbarPosition) { this.setVerticalScrollbarPosition(it) }

@RequiresApi(23)
fun View.setScrollIndicators(scrollIndicators: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(scrollIndicators) { this.setScrollIndicators(it) }

@RequiresApi(23)
fun View.setOnScrollChangeListener(onScrollChangeListener: io.reactivex.Flowable<out android.view.View.OnScrollChangeListener>) = 
	addSetter(onScrollChangeListener) { this.setOnScrollChangeListener(it) }

fun View.setOnFocusChangeListener(onFocusChangeListener: io.reactivex.Flowable<out android.view.View.OnFocusChangeListener>) = 
	addSetter(onFocusChangeListener) { this.setOnFocusChangeListener(it) }

fun View.setOnClickListener(onClickListener: io.reactivex.Flowable<out android.view.View.OnClickListener>) = 
	addSetter(onClickListener) { this.setOnClickListener(it) }

fun View.setOnLongClickListener(onLongClickListener: io.reactivex.Flowable<out android.view.View.OnLongClickListener>) = 
	addSetter(onLongClickListener) { this.setOnLongClickListener(it) }

@RequiresApi(23)
fun View.setOnContextClickListener(onContextClickListener: io.reactivex.Flowable<out android.view.View.OnContextClickListener>) = 
	addSetter(onContextClickListener) { this.setOnContextClickListener(it) }

fun View.setOnCreateContextMenuListener(onCreateContextMenuListener: io.reactivex.Flowable<out android.view.View.OnCreateContextMenuListener>) = 
	addSetter(onCreateContextMenuListener) { this.setOnCreateContextMenuListener(it) }

fun View.setOnKeyListener(onKeyListener: io.reactivex.Flowable<out android.view.View.OnKeyListener>) = 
	addSetter(onKeyListener) { this.setOnKeyListener(it) }

fun View.setOnTouchListener(onTouchListener: io.reactivex.Flowable<out android.view.View.OnTouchListener>) = 
	addSetter(onTouchListener) { this.setOnTouchListener(it) }

fun View.setOnGenericMotionListener(onGenericMotionListener: io.reactivex.Flowable<out android.view.View.OnGenericMotionListener>) = 
	addSetter(onGenericMotionListener) { this.setOnGenericMotionListener(it) }

fun View.setOnHoverListener(onHoverListener: io.reactivex.Flowable<out android.view.View.OnHoverListener>) = 
	addSetter(onHoverListener) { this.setOnHoverListener(it) }

fun View.setOnDragListener(onDragListener: io.reactivex.Flowable<out android.view.View.OnDragListener>) = 
	addSetter(onDragListener) { this.setOnDragListener(it) }

@RequiresApi(25)
fun View.setRevealOnFocusHint(revealOnFocusHint: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(revealOnFocusHint) { this.setRevealOnFocusHint(it) }

@RequiresApi(28)
fun View.setAccessibilityPaneTitle(accessibilityPaneTitle: io.reactivex.Flowable<out kotlin.CharSequence>) = 
	addSetter(accessibilityPaneTitle) { this.setAccessibilityPaneTitle(it) }

@RequiresApi(28)
fun View.setAutofillId(autofillId: io.reactivex.Flowable<out android.view.autofill.AutofillId>) = 
	addSetter(autofillId) { this.setAutofillId(it) }

@RequiresApi(26)
fun View.setImportantForAutofill(importantForAutofill: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(importantForAutofill) { this.setImportantForAutofill(it) }

@RequiresApi(29)
fun View.setContentCaptureSession(contentCaptureSession: io.reactivex.Flowable<out android.view.contentcapture.ContentCaptureSession>) = 
	addSetter(contentCaptureSession) { this.setContentCaptureSession(it) }

fun View.setAccessibilityDelegate(accessibilityDelegate: io.reactivex.Flowable<out android.view.View.AccessibilityDelegate>) = 
	addSetter(accessibilityDelegate) { this.setAccessibilityDelegate(it) }

fun View.setContentDescription(contentDescription: io.reactivex.Flowable<out kotlin.CharSequence>) = 
	addSetter(contentDescription) { this.setContentDescription(it) }

@RequiresApi(22)
fun View.setAccessibilityTraversalBefore(accessibilityTraversalBefore: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(accessibilityTraversalBefore) { this.setAccessibilityTraversalBefore(it) }

@RequiresApi(22)
fun View.setAccessibilityTraversalAfter(accessibilityTraversalAfter: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(accessibilityTraversalAfter) { this.setAccessibilityTraversalAfter(it) }

@RequiresApi(17)
fun View.setLabelFor(labelFor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(labelFor) { this.setLabelFor(it) }

fun View.setScrollContainer(scrollContainer: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(scrollContainer) { this.setScrollContainer(it) }

@Deprecated("Deprecated in Java")
fun View.setDrawingCacheQuality(drawingCacheQuality: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(drawingCacheQuality) { this.setDrawingCacheQuality(it) }

fun View.setKeepScreenOn(keepScreenOn: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(keepScreenOn) { this.setKeepScreenOn(it) }

fun View.setNextFocusLeftId(nextFocusLeftId: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(nextFocusLeftId) { this.setNextFocusLeftId(it) }

fun View.setNextFocusRightId(nextFocusRightId: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(nextFocusRightId) { this.setNextFocusRightId(it) }

fun View.setNextFocusUpId(nextFocusUpId: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(nextFocusUpId) { this.setNextFocusUpId(it) }

fun View.setNextFocusDownId(nextFocusDownId: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(nextFocusDownId) { this.setNextFocusDownId(it) }

fun View.setNextFocusForwardId(nextFocusForwardId: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(nextFocusForwardId) { this.setNextFocusForwardId(it) }

@RequiresApi(26)
fun View.setNextClusterForwardId(nextClusterForwardId: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(nextClusterForwardId) { this.setNextClusterForwardId(it) }

@RequiresApi(20)
fun View.setOnApplyWindowInsetsListener(onApplyWindowInsListener: io.reactivex.Flowable<out android.view.View.OnApplyWindowInsetsListener>) = 
	addSetter(onApplyWindowInsListener) { this.setOnApplyWindowInsetsListener(it) }

@RequiresApi(29)
fun View.setSystemGestureExclusionRects(systemGestureExclusionRects: io.reactivex.Flowable<out kotlin.collections.List<out android.graphics.Rect>>) = 
	addSetter(systemGestureExclusionRects) { this.setSystemGestureExclusionRects(it) }

fun View.setFitsSystemWindows(fitsSystemWindows: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(fitsSystemWindows) { this.setFitsSystemWindows(it) }

fun View.setVisibility(visibility: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(visibility) { this.setVisibility(it) }

fun View.setEnabled(enabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(enabled) { this.setEnabled(it) }

@RequiresApi(26)
fun View.setFocusable(focusable: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(focusable) { this.setFocusable(it) }

fun View.setIsFocusable(focusable: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(focusable) { this.setFocusable(it) }

fun View.setFocusableInTouchMode(focusableInTouchMode: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(focusableInTouchMode) { this.setFocusableInTouchMode(it) }

@RequiresApi(26)
fun View.setAutofillHints(autofillHints: io.reactivex.Flowable<out kotlin.Array<out kotlin.String>>) = 
	addSetter(autofillHints) { this.setAutofillHints(*it) }

fun View.setSoundEffectsEnabled(soundEffectsEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(soundEffectsEnabled) { this.setSoundEffectsEnabled(it) }

fun View.setHapticFeedbackEnabled(hapticFeedbackEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(hapticFeedbackEnabled) { this.setHapticFeedbackEnabled(it) }

@RequiresApi(17)
fun View.setLayoutDirection(layoutDirection: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(layoutDirection) { this.setLayoutDirection(it) }

fun View.setHasTransientState(hasTransientState: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(hasTransientState) { this.setHasTransientState(it) }

fun View.setWillNotDraw(willNotDraw: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(willNotDraw) { this.setWillNotDraw(it) }

@Deprecated("Deprecated in Java")
fun View.setWillNotCacheDrawing(willNotCacheDrawing: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(willNotCacheDrawing) { this.setWillNotCacheDrawing(it) }

fun View.setClickable(clickable: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(clickable) { this.setClickable(it) }

fun View.setLongClickable(longClickable: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(longClickable) { this.setLongClickable(it) }

@RequiresApi(23)
fun View.setContextClickable(contextClickable: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(contextClickable) { this.setContextClickable(it) }

fun View.setPressed(pressed: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(pressed) { this.setPressed(it) }

fun View.setSaveEnabled(saveEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(saveEnabled) { this.setSaveEnabled(it) }

fun View.setFilterTouchesWhenObscured(filterTouchesWhenObscured: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(filterTouchesWhenObscured) { this.setFilterTouchesWhenObscured(it) }

fun View.setSaveFromParentEnabled(saveFromParentEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(saveFromParentEnabled) { this.setSaveFromParentEnabled(it) }

@RequiresApi(28)
fun View.setScreenReaderFocusable(screenReaderFocusable: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(screenReaderFocusable) { this.setScreenReaderFocusable(it) }

@RequiresApi(28)
fun View.setAccessibilityHeading(accessibilityHeading: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(accessibilityHeading) { this.setAccessibilityHeading(it) }

@RequiresApi(26)
fun View.setKeyboardNavigationCluster(keyboardNavigationCluster: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(keyboardNavigationCluster) { this.setKeyboardNavigationCluster(it) }

@RequiresApi(26)
fun View.setFocusedByDefault(focusedByDefault: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(focusedByDefault) { this.setFocusedByDefault(it) }

@RequiresApi(26)
fun View.setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(defaultFocusHighlightEnabled) { this.setDefaultFocusHighlightEnabled(it) }

@RequiresApi(19)
fun View.setAccessibilityLiveRegion(accessibilityLiveRegion: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(accessibilityLiveRegion) { this.setAccessibilityLiveRegion(it) }

fun View.setImportantForAccessibility(importantForAccessibility: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(importantForAccessibility) { this.setImportantForAccessibility(it) }

@RequiresApi(29)
fun View.setTransitionVisibility(transitionVisibility: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(transitionVisibility) { this.setTransitionVisibility(it) }

fun View.setHovered(hovered: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(hovered) { this.setHovered(it) }

fun View.setTouchDelegate(touchDelegate: io.reactivex.Flowable<out android.view.TouchDelegate>) = 
	addSetter(touchDelegate) { this.setTouchDelegate(it) }

fun View.setScrollX(scrollX: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(scrollX) { this.setScrollX(it) }

fun View.setScrollY(scrollY: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(scrollY) { this.setScrollY(it) }

fun View.setCameraDistance(cameraDistance: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(cameraDistance) { this.setCameraDistance(it) }

fun View.setRotation(rotation: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(rotation) { this.setRotation(it) }

fun View.setRotationY(rotationY: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(rotationY) { this.setRotationY(it) }

fun View.setRotationX(rotationX: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(rotationX) { this.setRotationX(it) }

fun View.setScaleX(scaleX: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(scaleX) { this.setScaleX(it) }

fun View.setScaleY(scaleY: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(scaleY) { this.setScaleY(it) }

fun View.setPivotX(pivotX: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(pivotX) { this.setPivotX(it) }

fun View.setPivotY(pivotY: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(pivotY) { this.setPivotY(it) }

fun View.setAlpha(alpha: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(alpha) { this.setAlpha(it) }

@RequiresApi(29)
fun View.setTransitionAlpha(transitionAlpha: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(transitionAlpha) { this.setTransitionAlpha(it) }

@RequiresApi(29)
fun View.setForceDarkAllowed(forceDarkAllowed: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(forceDarkAllowed) { this.setForceDarkAllowed(it) }

fun View.setTop(top: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(top) { this.setTop(it) }

fun View.setBottom(bottom: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(bottom) { this.setBottom(it) }

fun View.setLeft(left: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(left) { this.setLeft(it) }

fun View.setRight(right: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(right) { this.setRight(it) }

fun View.setX(x: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(x) { this.setX(it) }

fun View.setY(y: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(y) { this.setY(it) }

@RequiresApi(21)
fun View.setZ(z: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(z) { this.setZ(it) }

@RequiresApi(21)
fun View.setElevation(elevation: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(elevation) { this.setElevation(it) }

fun View.setTranslationX(translationX: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(translationX) { this.setTranslationX(it) }

fun View.setTranslationY(translationY: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(translationY) { this.setTranslationY(it) }

@RequiresApi(21)
fun View.setTranslationZ(translationZ: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(translationZ) { this.setTranslationZ(it) }

@RequiresApi(29)
fun View.setAnimationMatrix(animationMatrix: io.reactivex.Flowable<out android.graphics.Matrix>) = 
	addSetter(animationMatrix) { this.setAnimationMatrix(it) }

@RequiresApi(21)
fun View.setStateListAnimator(stateListAnimator: io.reactivex.Flowable<out android.animation.StateListAnimator>) = 
	addSetter(stateListAnimator) { this.setStateListAnimator(it) }

@RequiresApi(21)
fun View.setClipToOutline(clipToOutline: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(clipToOutline) { this.setClipToOutline(it) }

@RequiresApi(21)
fun View.setOutlineProvider(outlineProvider: io.reactivex.Flowable<out android.view.ViewOutlineProvider>) = 
	addSetter(outlineProvider) { this.setOutlineProvider(it) }

@RequiresApi(28)
fun View.setOutlineSpotShadowColor(outlineSpotShadowColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(outlineSpotShadowColor) { this.setOutlineSpotShadowColor(it) }

@RequiresApi(28)
fun View.setOutlineAmbientShadowColor(outlineAmbientShadowColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(outlineAmbientShadowColor) { this.setOutlineAmbientShadowColor(it) }

fun View.setLayoutParams(layoutParams: io.reactivex.Flowable<out android.view.ViewGroup.LayoutParams>) = 
	addSetter(layoutParams) { this.setLayoutParams(it) }

fun View.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(horizontalFadingEdgeEnabled) { this.setHorizontalFadingEdgeEnabled(it) }

fun View.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(verticalFadingEdgeEnabled) { this.setVerticalFadingEdgeEnabled(it) }

fun View.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(horizontalScrollBarEnabled) { this.setHorizontalScrollBarEnabled(it) }

fun View.setVerticalScrollBarEnabled(verticalScrollBarEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(verticalScrollBarEnabled) { this.setVerticalScrollBarEnabled(it) }

fun View.setScrollbarFadingEnabled(scrollbarFadingEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(scrollbarFadingEnabled) { this.setScrollbarFadingEnabled(it) }

fun View.setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(scrollBarDefaultDelayBeforeFade) { this.setScrollBarDefaultDelayBeforeFade(it) }

fun View.setScrollBarFadeDuration(scrollBarFadeDuration: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(scrollBarFadeDuration) { this.setScrollBarFadeDuration(it) }

fun View.setScrollBarSize(scrollBarSize: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(scrollBarSize) { this.setScrollBarSize(it) }

fun View.setScrollBarStyle(scrollBarStyle: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(scrollBarStyle) { this.setScrollBarStyle(it) }

fun View.setDuplicateParentStateEnabled(duplicateParentStateEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(duplicateParentStateEnabled) { this.setDuplicateParentStateEnabled(it) }

@RequiresApi(17)
fun View.setLayerPaint(layerPaint: io.reactivex.Flowable<out android.graphics.Paint>) = 
	addSetter(layerPaint) { this.setLayerPaint(it) }

@Deprecated("Deprecated in Java")
fun View.setDrawingCacheEnabled(drawingCacheEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(drawingCacheEnabled) { this.setDrawingCacheEnabled(it) }

@Deprecated("Deprecated in Java")
fun View.setDrawingCacheBackgroundColor(drawingCacheBackgroundColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(drawingCacheBackgroundColor) { this.setDrawingCacheBackgroundColor(it) }

@RequiresApi(18)
fun View.setClipBounds(clipBounds: io.reactivex.Flowable<out android.graphics.Rect>) = 
	addSetter(clipBounds) { this.setClipBounds(it) }

fun View.setBackgroundColor(backgroundColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(backgroundColor) { this.setBackgroundColor(it) }

fun View.setBackgroundResource(backgroundResource: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(backgroundResource) { this.setBackgroundResource(it) }

fun View.setBackground(background: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(background) { this.setBackground(it) }

@Deprecated("Deprecated in Java")
fun View.setBackgroundDrawable(backgroundDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(backgroundDrawable) { this.setBackgroundDrawable(it) }

@RequiresApi(21)
fun View.setBackgroundTintList(backgroundTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(backgroundTintList) { this.setBackgroundTintList(it) }

@RequiresApi(21)
fun View.setBackgroundTintMode(backgroundTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(backgroundTintMode) { this.setBackgroundTintMode(it) }

@RequiresApi(29)
fun View.setBackgroundTintBlendMode(backgroundTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(backgroundTintBlendMode) { this.setBackgroundTintBlendMode(it) }

@RequiresApi(23)
fun View.setForeground(foreground: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(foreground) { this.setForeground(it) }

@RequiresApi(23)
fun View.setForegroundGravity(foregroundGravity: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(foregroundGravity) { this.setForegroundGravity(it) }

@RequiresApi(23)
fun View.setForegroundTintList(foregroundTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(foregroundTintList) { this.setForegroundTintList(it) }

@RequiresApi(23)
fun View.setForegroundTintMode(foregroundTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(foregroundTintMode) { this.setForegroundTintMode(it) }

@RequiresApi(29)
fun View.setForegroundTintBlendMode(foregroundTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(foregroundTintBlendMode) { this.setForegroundTintBlendMode(it) }

fun View.setSelected(selected: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(selected) { this.setSelected(it) }

fun View.setActivated(activated: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(activated) { this.setActivated(it) }

fun View.setId(id: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(id) { this.setId(it) }

fun View.setTag(tag: io.reactivex.Flowable<out kotlin.Any>) = 
	addSetter(tag) { this.setTag(it) }

fun View.setMinimumHeight(minimumHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minimumHeight) { this.setMinimumHeight(it) }

fun View.setMinimumWidth(minimumWidth: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minimumWidth) { this.setMinimumWidth(it) }

fun View.setAnimation(animation: io.reactivex.Flowable<out android.view.animation.Animation>) = 
	addSetter(animation) { this.setAnimation(it) }

fun View.setSystemUiVisibility(systemUiVisibility: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(systemUiVisibility) { this.setSystemUiVisibility(it) }

fun View.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener: io.reactivex.Flowable<out android.view.View.OnSystemUiVisibilityChangeListener>) = 
	addSetter(onSystemUiVisibilityChangeListener) { this.setOnSystemUiVisibilityChangeListener(it) }

fun View.setOverScrollMode(overScrollMode: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(overScrollMode) { this.setOverScrollMode(it) }

@RequiresApi(21)
fun View.setNestedScrollingEnabled(nestedScrollingEnabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(nestedScrollingEnabled) { this.setNestedScrollingEnabled(it) }

@RequiresApi(17)
fun View.setTextDirection(textDirection: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textDirection) { this.setTextDirection(it) }

@RequiresApi(17)
fun View.setTextAlignment(textAlignment: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textAlignment) { this.setTextAlignment(it) }

@RequiresApi(24)
fun View.setPointerIcon(pointerIcon: io.reactivex.Flowable<out android.view.PointerIcon>) = 
	addSetter(pointerIcon) { this.setPointerIcon(it) }

@RequiresApi(26)
fun View.setOnCapturedPointerListener(onCapturedPointerListener: io.reactivex.Flowable<out android.view.View.OnCapturedPointerListener>) = 
	addSetter(onCapturedPointerListener) { this.setOnCapturedPointerListener(it) }

@RequiresApi(21)
fun View.setTransitionName(transitionName: io.reactivex.Flowable<out kotlin.String>) = 
	addSetter(transitionName) { this.setTransitionName(it) }

@RequiresApi(26)
fun View.setTooltipText(tooltipText: io.reactivex.Flowable<out kotlin.CharSequence>) = 
	addSetter(tooltipText) { this.setTooltipText(it) }