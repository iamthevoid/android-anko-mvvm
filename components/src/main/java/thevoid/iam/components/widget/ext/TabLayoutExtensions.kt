package thevoid.iam.components.widget.ext

import com.google.android.material.tabs.TabLayout
import thevoid.iam.components.R
import thevoid.iam.components.rx.fields.RxField
import thevoid.iam.components.widget.adapter.OnTabSelectedListenerAdapter
import thevoid.iam.components.widget.delegate.OnTabSelectedListenerDelegate

private val TabLayout.onTabSelectListener: OnTabSelectedListenerDelegate
    get() = ((getTag(R.id.onTabSelectListener) as? OnTabSelectedListenerDelegate)
        ?: OnTabSelectedListenerDelegate().also { setTag(R.id.onTabSelectListener, it) })
        .also {
            removeOnTabSelectedListener(it)
            addOnTabSelectedListener(it)
        }


fun TabLayout.onTabReselect(rxTab: RxField<TabLayout.Tab>) =
    onTabReselect(rxTab) { it }

fun <T : Any> TabLayout.onTabReselect(rxField: RxField<T>, mapper : ((TabLayout.Tab?) -> T?)) =
    addGetter({
        onTabSelectListener.addOnTabReselectCallback(object : OnTabSelectedListenerAdapter() {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                it.invoke(mapper(tab))
            }
        })
    }, rxField)


fun TabLayout.onTabUnselected(rxTab: RxField<TabLayout.Tab>) =
    onTabUnselected(rxTab) { it }

fun <T : Any> TabLayout.onTabUnselected(rxField: RxField<T>, mapper : ((TabLayout.Tab?) -> T?)) =
    addGetter({
        onTabSelectListener.addOnTabUnselectedCallback(object : OnTabSelectedListenerAdapter() {
            override fun onTabUnselected(tab: TabLayout.Tab?) {
                it.invoke(mapper(tab))
            }
        })
    }, rxField)


fun TabLayout.onTabSelected(rxTab: RxField<TabLayout.Tab>) =
    onTabSelected(rxTab) { it }

fun <T : Any> TabLayout.onTabSelected(rxField: RxField<T>, mapper : ((TabLayout.Tab?) -> T?)) =
    addGetter({
        onTabSelectListener.addOnTabSelectedCallback(object : OnTabSelectedListenerAdapter() {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                it.invoke(mapper(tab))
            }
        })
    }, rxField)