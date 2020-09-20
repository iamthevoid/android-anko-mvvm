package iam.thevoid.noxml.generator

data class Library(val name: String, val prefix: String, val streamClassCanonicalName : String) {
    companion object {
        val realizations = listOf(
            Library(name = "rxjava2", prefix = "rx2", streamClassCanonicalName = "io.reactivex.Flowable"),
        )
    }
}
