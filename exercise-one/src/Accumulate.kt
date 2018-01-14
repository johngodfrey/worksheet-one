object Accumulate {
    fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
        val results= mutableListOf<R>()
        for (item in collection) {
            results.add(function(item))
        }
        return results
    }
}