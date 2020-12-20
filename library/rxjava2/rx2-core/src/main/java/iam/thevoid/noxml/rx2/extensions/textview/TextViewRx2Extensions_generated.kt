@file:Suppress(
	"unused", 
	"UsePropertyAccessSyntax", 
	"RemoveRedundantQualifierName", 
	"UnusedImport",
	"DeprecatedCallableAddReplaceWith",
    "DEPRECATION"
)

package iam.thevoid.noxml.rx2.extensions.textview

import android.widget.TextView

import io.reactivex.Flowable
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import androidx.annotation.RequiresApi


fun TextView.setEnabled(enabled: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(enabled) { this.setEnabled(it) }

fun TextView.setSelected(selected: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(selected) { this.setSelected(it) }

fun TextView.setError(error: io.reactivex.Flowable<out kotlin.CharSequence>) = 
	addSetter(error) { this.setError(it) }

fun TextView.setTypeface(typeface: io.reactivex.Flowable<out android.graphics.Typeface>) = 
	addSetter(typeface) { this.setTypeface(it) }

@RequiresApi(26)
fun TextView.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(autoSizeTextTypeWithDefaults) { this.setAutoSizeTextTypeWithDefaults(it) }

fun TextView.setKeyListener(keyListener: io.reactivex.Flowable<out android.text.method.KeyListener>) = 
	addSetter(keyListener) { this.setKeyListener(it) }

fun TextView.setMovementMethod(movementMethod: io.reactivex.Flowable<out android.text.method.MovementMethod>) = 
	addSetter(movementMethod) { this.setMovementMethod(it) }

fun TextView.setTransformationMethod(transformationMethod: io.reactivex.Flowable<out android.text.method.TransformationMethod>) = 
	addSetter(transformationMethod) { this.setTransformationMethod(it) }

fun TextView.setMinWidth(minWidth: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minWidth) { this.setMinWidth(it) }

fun TextView.setMaxWidth(maxWidth: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxWidth) { this.setMaxWidth(it) }

fun TextView.setMinHeight(minHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minHeight) { this.setMinHeight(it) }

fun TextView.setMaxHeight(maxHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxHeight) { this.setMaxHeight(it) }

fun TextView.setExtractedText(extractedText: io.reactivex.Flowable<out android.view.inputmethod.ExtractedText>) = 
	addSetter(extractedText) { this.setExtractedText(it) }

fun TextView.setIncludeFontPadding(includeFontPadding: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(includeFontPadding) { this.setIncludeFontPadding(it) }

fun TextView.setIsSingleLine(singleLine: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(singleLine) { this.setSingleLine(it) }

fun TextView.setAllCaps(allCaps: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(allCaps) { this.setAllCaps(it) }

fun TextView.setEllipsize(ellipsize: io.reactivex.Flowable<out android.text.TextUtils.TruncateAt>) = 
	addSetter(ellipsize) { this.setEllipsize(it) }

fun TextView.setMarqueeRepeatLimit(marqueeRepeatLimit: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(marqueeRepeatLimit) { this.setMarqueeRepeatLimit(it) }

fun TextView.setSelectAllOnFocus(selectAllOnFocus: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(selectAllOnFocus) { this.setSelectAllOnFocus(it) }

fun TextView.setCursorVisible(cursorVisible: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(cursorVisible) { this.setCursorVisible(it) }

fun TextView.setScroller(scroller: io.reactivex.Flowable<out android.widget.Scroller>) = 
	addSetter(scroller) { this.setScroller(it) }

fun TextView.setCustomSelectionActionModeCallback(customSelectionActionModeCallback: io.reactivex.Flowable<out android.view.ActionMode.Callback>) = 
	addSetter(customSelectionActionModeCallback) { this.setCustomSelectionActionModeCallback(it) }

@RequiresApi(23)
fun TextView.setCustomInsertionActionModeCallback(customInsertionActionModeCallback: io.reactivex.Flowable<out android.view.ActionMode.Callback>) = 
	addSetter(customInsertionActionModeCallback) { this.setCustomInsertionActionModeCallback(it) }

@RequiresApi(26)
fun TextView.setTextClassifier(textClassifier: io.reactivex.Flowable<out android.view.textclassifier.TextClassifier>) = 
	addSetter(textClassifier) { this.setTextClassifier(it) }

fun TextView.setCompoundDrawablePadding(compoundDrawablePadding: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(compoundDrawablePadding) { this.setCompoundDrawablePadding(it) }

@RequiresApi(23)
fun TextView.setCompoundDrawableTintList(compoundDrawableTintList: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(compoundDrawableTintList) { this.setCompoundDrawableTintList(it) }

@RequiresApi(23)
fun TextView.setCompoundDrawableTintMode(compoundDrawableTintMode: io.reactivex.Flowable<out android.graphics.PorterDuff.Mode>) = 
	addSetter(compoundDrawableTintMode) { this.setCompoundDrawableTintMode(it) }

@RequiresApi(29)
fun TextView.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode: io.reactivex.Flowable<out android.graphics.BlendMode>) = 
	addSetter(compoundDrawableTintBlendMode) { this.setCompoundDrawableTintBlendMode(it) }

@RequiresApi(28)
fun TextView.setFirstBaselineToTopHeight(firstBaselineToTopHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(firstBaselineToTopHeight) { this.setFirstBaselineToTopHeight(it) }

@RequiresApi(28)
fun TextView.setLastBaselineToBottomHeight(lastBaselineToBottomHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(lastBaselineToBottomHeight) { this.setLastBaselineToBottomHeight(it) }

@RequiresApi(29)
fun TextView.setTextSelectHandleResource(textSelectHandle: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textSelectHandle) { this.setTextSelectHandle(it) }

@RequiresApi(29)
fun TextView.setTextSelectHandle(textSelectHandle: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(textSelectHandle) { this.setTextSelectHandle(it) }

@RequiresApi(29)
fun TextView.setTextSelectHandleLeftResource(textSelectHandleLeft: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textSelectHandleLeft) { this.setTextSelectHandleLeft(it) }

@RequiresApi(29)
fun TextView.setTextSelectHandleLeft(textSelectHandleLeft: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(textSelectHandleLeft) { this.setTextSelectHandleLeft(it) }

@RequiresApi(29)
fun TextView.setTextSelectHandleRight(textSelectHandleRight: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(textSelectHandleRight) { this.setTextSelectHandleRight(it) }

@RequiresApi(29)
fun TextView.setTextSelectHandleRightResource(textSelectHandleRight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textSelectHandleRight) { this.setTextSelectHandleRight(it) }

@RequiresApi(29)
fun TextView.setTextCursorDrawable(textCursorDrawable: io.reactivex.Flowable<out android.graphics.drawable.Drawable>) = 
	addSetter(textCursorDrawable) { this.setTextCursorDrawable(it) }

@RequiresApi(29)
fun TextView.setTextCursorDrawableResource(textCursorDrawable: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textCursorDrawable) { this.setTextCursorDrawable(it) }

@RequiresApi(23)
fun TextView.setTextAppearance(textAppearance: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textAppearance) { this.setTextAppearance(it) }

@RequiresApi(17)
fun TextView.setTextLocale(textLocale: io.reactivex.Flowable<out java.util.Locale>) = 
	addSetter(textLocale) { this.setTextLocale(it) }

@RequiresApi(24)
fun TextView.setTextLocales(textLocales: io.reactivex.Flowable<out android.os.LocaleList>) = 
	addSetter(textLocales) { this.setTextLocales(it) }

fun TextView.setTextSize(textSize: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(textSize) { this.setTextSize(it) }

fun TextView.setTextScaleX(textScaleX: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(textScaleX) { this.setTextScaleX(it) }

@RequiresApi(21)
fun TextView.setElegantTextHeight(elegantTextHeight: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(elegantTextHeight) { this.setElegantTextHeight(it) }

@RequiresApi(28)
fun TextView.setFallbackLineSpacing(fallbackLineSpacing: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(fallbackLineSpacing) { this.setFallbackLineSpacing(it) }

@RequiresApi(21)
fun TextView.setLetterSpacing(letterSpacing: io.reactivex.Flowable<out kotlin.Float>) = 
	addSetter(letterSpacing) { this.setLetterSpacing(it) }

@RequiresApi(23)
fun TextView.setBreakStrategy(breakStrategy: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(breakStrategy) { this.setBreakStrategy(it) }

@RequiresApi(23)
fun TextView.setHyphenationFrequency(hyphenationFrequency: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(hyphenationFrequency) { this.setHyphenationFrequency(it) }

@RequiresApi(28)
fun TextView.setTextMetricsParams(textMetricsParams: io.reactivex.Flowable<out android.text.PrecomputedText.Params>) = 
	addSetter(textMetricsParams) { this.setTextMetricsParams(it) }

@RequiresApi(26)
fun TextView.setJustificationMode(justificationMode: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(justificationMode) { this.setJustificationMode(it) }

@RequiresApi(21)
fun TextView.setFontFeatureSettings(fontFeatureSettings: io.reactivex.Flowable<out kotlin.String>) = 
	addSetter(fontFeatureSettings) { this.setFontFeatureSettings(it) }

@RequiresApi(26)
fun TextView.setFontVariationSettings(fontVariationSettings: io.reactivex.Flowable<out kotlin.String>) = 
	addSetter(fontVariationSettings) { this.setFontVariationSettings(it) }

fun TextView.setTextColor(textColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(textColor) { this.setTextColor(it) }

fun TextView.setTextColorStateList(textColor: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(textColor) { this.setTextColor(it) }

fun TextView.setHighlightColor(highlightColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(highlightColor) { this.setHighlightColor(it) }

@RequiresApi(21)
fun TextView.setShowSoftInputOnFocus(showSoftInputOnFocus: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(showSoftInputOnFocus) { this.setShowSoftInputOnFocus(it) }

fun TextView.setAutoLinkMask(autoLinkMask: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(autoLinkMask) { this.setAutoLinkMask(it) }

fun TextView.setLinksClickable(linksClickable: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(linksClickable) { this.setLinksClickable(it) }

fun TextView.setHintTextColorStateList(hintTextColor: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(hintTextColor) { this.setHintTextColor(it) }

fun TextView.setHintTextColor(hintTextColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(hintTextColor) { this.setHintTextColor(it) }

fun TextView.setLinkTextColorStateList(linkTextColor: io.reactivex.Flowable<out android.content.res.ColorStateList>) = 
	addSetter(linkTextColor) { this.setLinkTextColor(it) }

fun TextView.setLinkTextColor(linkTextColor: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(linkTextColor) { this.setLinkTextColor(it) }

fun TextView.setGravity(gravity: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(gravity) { this.setGravity(it) }

fun TextView.setPaintFlags(paintFlags: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(paintFlags) { this.setPaintFlags(it) }

fun TextView.setHorizontallyScrolling(horizontallyScrolling: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(horizontallyScrolling) { this.setHorizontallyScrolling(it) }

fun TextView.setMinLines(minLines: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minLines) { this.setMinLines(it) }

fun TextView.setMaxLines(maxLines: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxLines) { this.setMaxLines(it) }

fun TextView.setLines(lines: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(lines) { this.setLines(it) }

fun TextView.setHeight(height: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(height) { this.setHeight(it) }

fun TextView.setMinEms(minEms: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(minEms) { this.setMinEms(it) }

fun TextView.setMaxEms(maxEms: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(maxEms) { this.setMaxEms(it) }

fun TextView.setEms(ems: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(ems) { this.setEms(it) }

fun TextView.setWidth(width: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(width) { this.setWidth(it) }

@RequiresApi(28)
fun TextView.setLineHeight(lineHeight: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(lineHeight) { this.setLineHeight(it) }

fun TextView.setFreezesText(freezesText: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(freezesText) { this.setFreezesText(it) }

fun TextView.setEditableFactory(editableFactory: io.reactivex.Flowable<out android.text.Editable.Factory>) = 
	addSetter(editableFactory) { this.setEditableFactory(it) }

fun TextView.setSpannableFactory(spannableFactory: io.reactivex.Flowable<out android.text.Spannable.Factory>) = 
	addSetter(spannableFactory) { this.setSpannableFactory(it) }

fun TextView.setTextResource(text: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(text) { this.setText(it) }

fun TextView.setTextKeepState(textKeepState: io.reactivex.Flowable<out kotlin.CharSequence>) = 
	addSetter(textKeepState) { this.setTextKeepState(it) }

fun TextView.setHintResource(hint: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(hint) { this.setHint(it) }

fun TextView.setHint(hint: io.reactivex.Flowable<out kotlin.CharSequence>) = 
	addSetter(hint) { this.setHint(it) }

fun TextView.setInputType(inputType: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(inputType) { this.setInputType(it) }

fun TextView.setRawInputType(rawInputType: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(rawInputType) { this.setRawInputType(it) }

fun TextView.setImeOptions(imeOptions: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(imeOptions) { this.setImeOptions(it) }

fun TextView.setOnEditorActionListener(onEditorActionListener: io.reactivex.Flowable<out android.widget.TextView.OnEditorActionListener>) = 
	addSetter(onEditorActionListener) { this.setOnEditorActionListener(it) }

fun TextView.setPrivateImeOptions(privateImeOptions: io.reactivex.Flowable<out kotlin.String>) = 
	addSetter(privateImeOptions) { this.setPrivateImeOptions(it) }

fun TextView.setInputExtras(inputExtras: io.reactivex.Flowable<out kotlin.Int>) = 
	addSetter(inputExtras) { this.setInputExtras(it) }

@RequiresApi(24)
fun TextView.setImeHintLocales(imeHintLocales: io.reactivex.Flowable<out android.os.LocaleList>) = 
	addSetter(imeHintLocales) { this.setImeHintLocales(it) }

fun TextView.setFilters(filters: io.reactivex.Flowable<out kotlin.Array<out android.text.InputFilter>>) = 
	addSetter(filters) { this.setFilters(it) }

fun TextView.setTextIsSelectable(textIsSelectable: io.reactivex.Flowable<out kotlin.Boolean>) = 
	addSetter(textIsSelectable) { this.setTextIsSelectable(it) }