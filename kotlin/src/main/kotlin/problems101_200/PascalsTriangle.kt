package problems101_200

enum class PascalsTriangle {
    DEFAULT {
        override fun generate(numRows: Int): List<List<Int>> {
            val rows = ArrayList<List<Int>>(numRows)
            rows += listOf(1)
            for (i in 1 until numRows) {
                val numColumns = i + 1
                val columns = ArrayList<Int>(numColumns)
                for (j in 0 until numColumns) {
                    if (j == 0 || j == numColumns - 1) {
                        columns += 1
                        continue
                    }
                    val prevColumns = rows[i - 1]
                    columns += prevColumns[j - 1] + prevColumns[j]
                }
                rows += columns
            }
            return rows
        }
    },
    ;

    abstract fun generate(numRows: Int): List<List<Int>>
}
