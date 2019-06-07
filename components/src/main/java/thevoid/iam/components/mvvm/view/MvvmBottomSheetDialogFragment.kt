package thevoid.iam.components.mvvm.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import thevoid.iam.components.mvvm.viewmodel.LifecycleTrackingViewModel

abstract class MvvmBottomSheetDialogFragment : BottomSheetDialogFragment(), MvvmView {

    lateinit var viewModels: Map<Class<out ViewModel>, ViewModel>
        private set

    inline fun <reified VM : ViewModel> viewModel() =
        (viewModels[VM::class.java] as? VM)
            ?: throw RuntimeException("View model with class ${VM::class.qualifiedName} not provided for this dialog fragment")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModels = provideViewModel().bundles.let { bundles ->
            bundles.associate { bundle ->
                bundle.cls to with(bundle) {

                    activity?.let { activity ->
                        factory?.let { ViewModelProviders.of(activity, bundle) } ?: ViewModelProviders.of(activity)
                    } ?: this@MvvmBottomSheetDialogFragment.let { fragment ->
                        factory?.let { ViewModelProviders.of(fragment, bundle) } ?: ViewModelProviders.of(fragment)
                    }

                }[bundle.cls].also {
                    (it as? LifecycleTrackingViewModel)?.apply {
                        registerLifecycle(this@MvvmBottomSheetDialogFragment)
                    }
                    onConfigureViewModel(it)
                }
            }
        }
    }

    open fun onConfigureViewModel(viewModel: ViewModel) = Unit

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        provideContentView()
}