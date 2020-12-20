package iam.thevoid.noxml.demo.ui.mvvm.pagination

import androidx.lifecycle.ViewModel
import iam.thevoid.noxml.demo.data.api.ButikApi
import iam.thevoid.noxml.recycler.paging.PageLoader
import iam.thevoid.noxml.rx2.data.RxLoading
import iam.thevoid.noxml.rx2.recycler.pagination.RxPageLoader
import iam.thevoid.noxml.rx2.utils.loading
import io.reactivex.Flowable

class ButikViewModel : ViewModel() {

    val refreshing by lazy(::RxLoading)

    val loader by lazy {
        RxPageLoader.create(1, nextPage = { page -> page + 1 }) { page: Int, _ ->
            ButikApi.catalog(page).loading(refreshing)
                .map { it.run { PageLoader.Page(items, currentPage, isLastPage) } }
        }
    }

    val items = loader.pages.map { list -> list.map { page -> page.items }.flatten() }
}