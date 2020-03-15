package iam.thevoid.noxml.recycler

import androidx.recyclerview.widget.RecyclerView
import iam.thevoid.noxml.adapterview.Layout
import iam.thevoid.noxml.rx2.recycler.extensions.fakeAttachToWindow
import iam.thevoid.noxml.recycler.util.isCallingFromMatcher
import iam.thevoid.noxml.recycler.util.isRunningTest
import iam.thevoid.noxml.recycler.util.onItAndChildrenTree

class Holder<T>(private val layout: Layout<T>) : RecyclerView.ViewHolder(layout.view) {

    fun onBind(item: T) = (layout as? Layout<T>)?.apply {
        if (isRunningTest() && isCallingFromMatcher())
            layout.view.onItAndChildrenTree { fakeAttachToWindow() }
        this@apply.set(item)
    }
}