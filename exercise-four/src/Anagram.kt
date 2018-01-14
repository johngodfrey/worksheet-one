class Anagram(private val word: String) {

    fun match(anagrams: Collection<String>): Set<String> {
        val results = mutableSetOf<String>()
        for (anagram in anagrams) {
            if (word.length == anagram.length && word.toLowerCase() != anagram.toLowerCase()) {
                val wordList = mutableListOf<Char>()
                for (ch in word.toLowerCase()) {
                    wordList.add(ch)
                }
                val anagramList = mutableListOf<Char>()
                for (ch in anagram.toLowerCase()) {
                    anagramList.add(ch)
                }
                wordList.sort()
                anagramList.sort()
                if (wordList == anagramList) {
                    results.add(anagram)
                }
            }
        }
        return results
    }
}