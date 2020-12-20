@file:Suppress("unused")

package iam.thevoid.noxml.rx2.extensions.textview

import android.text.Editable
import android.widget.EditText
import android.widget.TextView
import iam.thevoid.ae.color
import iam.thevoid.ae.setTextStrikeThru
import iam.thevoid.ae.string
import iam.thevoid.e.format
import iam.thevoid.e.safe
import iam.thevoid.noxml.change.textwatcher.BeforeEditTextChanges
import iam.thevoid.noxml.change.textwatcher.OnEditTextChanges
import iam.thevoid.noxml.core.local.adapters.TextWatcherAdapter
import iam.thevoid.noxml.core.local.extensions.textview.hasTextWatcherDelegate
import iam.thevoid.noxml.core.local.extensions.textview.setTextSilent
import iam.thevoid.noxml.core.local.extensions.textview.textWatcherDelegate
import iam.thevoid.noxml.rx2.data.fields.*
import iam.thevoid.noxml.rx2.data.onlyPresent
import iam.thevoid.noxml.rx2.extensions.view.addSetter
import iam.thevoid.util.Optional
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.processors.FlowableProcessor

fun TextView.setText(text: Flowable<out CharSequence>) =
    addSetter(text) {
        if (hasTextWatcherDelegate()) {
            setTextSilent(it)
        } else {
            this.text = it
        }
    }

fun TextView.setTextResource(textResource: Flowable<Int>) =
    setText(textResource.map { string(it) })

fun TextView.setTextColorResource(colorResource: Flowable<Int>) =
    addSetter(colorResource) { setTextColor(color(it)) }

fun TextView.setHintTextColorResource(colorResource: Flowable<Int>) =
    addSetter(colorResource) { setHintTextColor(color(it)) }

fun TextView.setTextStrikeThru(strikeThru: Flowable<Boolean>) =
    addSetter(strikeThru) { setTextStrikeThru(it) }

/**
 * GETTER
 */

/**
 * afterTextChanges
 */

fun <T : Any> EditText.afterTextChanges(
    afterTextChanges: FlowableProcessor<T>,
    mapper: (Editable?) -> T?,
    unwrap: Flowable<Optional<T>>.() -> Flowable<T> = { onlyPresent() }
) = addSetter(Flowable.create<Optional<T>>({
    val callback = object : TextWatcherAdapter() {
        override fun afterTextChanged(s: Editable?) = it.onNext(Optional.of(mapper(s)))
    }
    textWatcherDelegate.addAfterTextChangedCallback(callback)
    it.setCancellable { textWatcherDelegate.removeAfterTextChangedCallback(callback) }
}, BackpressureStrategy.LATEST).unwrap().doOnNext(afterTextChanges::onNext))

fun EditText.afterTextChanges(
    afterTextChanges: FlowableProcessor<String>,
    unwrap: Flowable<Optional<String>>.() -> Flowable<String> = { onlyPresent() }
) = afterTextChanges(afterTextChanges, mapper = { it?.toString() }, unwrap)

/**
 * beforeTextChanges
 */

fun <T : Any> EditText.beforeTextChanges(
    beforeTextChanges: FlowableProcessor<T>,
    mapper: (BeforeEditTextChanges) -> T
) = addSetter(Flowable.create<T>({
    val callback = object : TextWatcherAdapter() {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) =
            it.onNext(mapper(BeforeEditTextChanges(s, start, count, after)))
    }
    textWatcherDelegate.addBeforeTextChangedCallback(callback)
    it.setCancellable { textWatcherDelegate.removeBeforeTextChangedCallback(callback) }
}, BackpressureStrategy.LATEST).doOnNext(beforeTextChanges::onNext))

fun EditText.beforeTextChanges(beforeTextChanges: FlowableProcessor<BeforeEditTextChanges>) =
    beforeTextChanges(beforeTextChanges, mapper = { it })

/**
 * onTextChanges
 */

fun <T : Any> EditText.onTextChanges(
    onTextChanges: FlowableProcessor<T>,
    mapper: (OnEditTextChanges) -> T
) = addSetter(Flowable.create<T>({
    val callback = object : TextWatcherAdapter() {
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) =
            it.onNext(mapper(OnEditTextChanges(s, start, before, count)))
    }
    textWatcherDelegate.addOnTextChangedCallback(callback)
    it.setCancellable { textWatcherDelegate.removeOnTextChangedCallback(callback) }
}, BackpressureStrategy.LATEST).doOnNext(onTextChanges::onNext))

fun EditText.onTextChanges(onTextChanges: FlowableProcessor<OnEditTextChanges>) =
    onTextChanges(onTextChanges) { it }
