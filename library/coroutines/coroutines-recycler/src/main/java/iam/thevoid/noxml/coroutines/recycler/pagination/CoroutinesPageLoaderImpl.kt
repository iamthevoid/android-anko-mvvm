package iam.thevoid.noxml.coroutines.recycler.pagination

import iam.thevoid.noxml.coroutines.data.CoroutineBoolean
import iam.thevoid.noxml.coroutines.data.CoroutineItem
import iam.thevoid.noxml.coroutines.data.CoroutineList
import iam.thevoid.noxml.recycler.paging.PageLoader
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicBoolean

class CoroutinesPageLoaderImpl<PAGE_INDEX, T>(
        private val startPage: PAGE_INDEX,
        private val nextPage: (PAGE_INDEX) -> PAGE_INDEX,
        private val loader: suspend (PAGE_INDEX, refresh : Boolean) -> PageLoader.Page<PAGE_INDEX, T>
) : CoroutinesPageLoader<PAGE_INDEX, T>, CoroutineScope by CoroutineScope(Dispatchers.IO) {

    private val isLastPage: AtomicBoolean = AtomicBoolean()

    private var loadingJob: Job? = null

    private val loaded: CoroutineList<PageLoader.Page<PAGE_INDEX, T>> = CoroutineList()

    fun addPage(page: PageLoader.Page<PAGE_INDEX, T>) = loaded.add(page)

    fun setPage(page: PageLoader.Page<PAGE_INDEX, T>) = loaded.set(listOf(page))

    /**
     * loading state
     */
    override val loading = CoroutineBoolean()

    /**
     * Last loaded page
     */

    override val currentPage: CoroutineItem<PAGE_INDEX> = CoroutineItem(startPage)

    /**
     * Received items
     */
    override val pages: Flow<List<PageLoader.Page<PAGE_INDEX, T>>> by lazy {
        loaded.observe().onStart {
            if (loaded.isEmpty()) {
                load(startPage, false)
            }
        }
    }

    override fun refresh() {
        loadingJob = launch { load(startPage, true) }
    }

    override fun loadMore() {
        loadingJob = launch { load(nextPage(currentPage.get()), false) }
    }

    private suspend fun load(page: PAGE_INDEX, refresh: Boolean) {

        if (!refresh && isLastPage.get())
            return

        loading.set(true)
        val response = loader(page, refresh)
        loading.set(false)

        when {
            refresh -> setPage(response)
            else -> addPage(response)
        }

        currentPage.set(response.pageIndex)
        isLastPage.set(response.isLastPage)
    }
}