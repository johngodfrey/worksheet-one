object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val words = phrase.split(" ", ",\n", ",")
        val trimmedWords = mutableListOf<String>()
        for (word in words) {
            var notQuoted = word
            if (notQuoted.startsWith("'") && notQuoted.endsWith("'")) {
                notQuoted = notQuoted.substring(1, notQuoted.length - 1)
            }
            val filtered = filter(notQuoted)
            if (filtered.isNotEmpty()) {
                trimmedWords.add(filtered)
            }
        }
        return trimmedWords.groupingBy { it }.eachCount()
    }

    fun filter(word: String): String {
        val sb = StringBuilder()
        for (ch in word) {
            if (ch.isLetterOrDigit() || ch.toInt() == 39) {
                sb.append(ch)
            }
        }
        return sb.toString().toLowerCase()
    }
}