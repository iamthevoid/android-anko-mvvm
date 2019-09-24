package thevoid.iam.rx.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.jakewharton.rx.ReplayingShare
import io.reactivex.Flowable
import thevoid.iam.rx.rxdata.fields.RxField

abstract class Layout<T>(private val parent: ViewGroup) {

    private val itemFactory: () -> RxField<T> = { RxField() }

    val view by lazy { createView(parent) }

    val context: Context
        get() = parent.context

    val item: RxField<T> by lazy(itemFactory)

    val itemChanges: Flowable<T> by lazy {
        item.onlyPresent().compose(ReplayingShare.instance())
    }

    abstract fun createView(parent: ViewGroup): View

    fun changeItem(itemChange: T.() -> Unit) {
        item.set(item.get()?.apply {
            itemChange()
        })
    }
}