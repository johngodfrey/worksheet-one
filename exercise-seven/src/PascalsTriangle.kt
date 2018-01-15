object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        if (rows < 0) {
            throw IllegalArgumentException("Rows can't be negative!")
        }
        val result = mutableListOf<List<Int>>()
        if (rows != 0) {
            for (line in 0..rows - 1) {
                val lineList = mutableListOf<Int>()
                for (position in 0..line) {
                    if (line == position || position == 0) {
                        lineList.add(1)
                    } else {
                        lineList.add(result[line - 1][position - 1] + result[line - 1][position])
                    }
                }
                result.add(lineList)
            }
        }
        return result
    }
}