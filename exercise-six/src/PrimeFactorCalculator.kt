object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        var divisor = 2
        var numerator = int
        val primeFactors = mutableListOf<Int>()
        while (numerator != 1) {
            if (numerator % divisor == 0) {
                numerator /= divisor
                primeFactors.add(divisor)
            } else {
                divisor++
            }
        }
        return primeFactors
    }

    fun primeFactors(long: Long): List<Long> {
        var divisor = 2L
        var numerator = long
        val primeFactors = mutableListOf<Long>()
        while (numerator != 1L) {
            if (numerator % divisor == 0L) {
                numerator /= divisor
                primeFactors.add(divisor)
            } else {
                divisor++
            }
        }
        return primeFactors
    }
}