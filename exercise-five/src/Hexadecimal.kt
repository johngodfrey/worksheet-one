object Hexadecimal {

    fun toDecimal(s: String): Int {
        var result = 0.0
        val reversedInput = s.toLowerCase().toCharArray().reversed()
        println(reversedInput)
        var foundIllegalInput = false
        val legalChars = listOf('a', 'b', 'c', 'd', 'e', 'f', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
        for ((index, ch) in reversedInput.withIndex()) {
            if (ch !in legalChars) {
                foundIllegalInput = true
            } else {
                if (ch.isDigit()) {
                    result += Integer.parseInt(ch.toString()) * Math.pow(16.0, index.toDouble())
                } else {
                    result += (ch.toInt() - 87) * Math.pow(16.0, index.toDouble())
                }
            }
        }
        if (foundIllegalInput) {
            result = 0.0
        }
        return result.toInt()
    }
}