object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val sums = mutableSetOf<Int>()
        for (factor in factors) {
            var counter = 0
            while (counter * factor < limit) {
                sums.add(counter * factor)
                counter++
            }
        }
        var total = 0
        for (sum in sums) {
            total += sum
        }
        return total
    }
}