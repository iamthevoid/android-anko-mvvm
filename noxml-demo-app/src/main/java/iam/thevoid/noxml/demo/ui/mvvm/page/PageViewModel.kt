package iam.thevoid.noxml.demo.ui.mvvm.page

import iam.thevoid.noxml.change.textwatcher.OnEditTextChanges
import iam.thevoid.noxml.rx.mvvm.viewmodel.RxViewModel
import iam.thevoid.noxml.rx.rxdata.fields.RxBoolean
import iam.thevoid.noxml.rx.rxdata.fields.RxField

class PageViewModel : RxViewModel() {

    val changes by lazy { RxField<OnEditTextChanges>() }

    val input by lazy { RxBoolean(true) }
}