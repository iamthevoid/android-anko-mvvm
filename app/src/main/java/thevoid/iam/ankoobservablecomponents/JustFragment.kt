package thevoid.iam.ankoobservablecomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import thevoid.iam.components.mvvm.ViewModelBundleProvider
import thevoid.iam.components.mvvm.view.MvvmFragment
import thevoid.iam.components.mvvm.createBundle
import thevoid.iam.components.widget.ext.setBackgroundColor

class JustFragment : MvvmFragment() {

    override fun provideViewModel(): ViewModelBundleProvider = createBundle(JustViewModel::class)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        context?.let { createView(AnkoContext.create(it, this)) }

    override fun createView(ui: AnkoContext<MvvmFragment>): View =
        ui.frameLayout {
            padding = dip(3)
            frameLayout {
                setBackgroundColor(viewModel<JustViewModel>().color)
            }
        }
}