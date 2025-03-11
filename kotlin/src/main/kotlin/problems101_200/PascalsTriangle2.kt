package problems101_200

enum class PascalsTriangle2 {
    DEFAULT {
        override fun getRow(rowIndex: Int): List<Int> {
            val numRows = rowIndex + 1

            val rows = ArrayList<List<Int>>(numRows)
            rows.add(listOf(1))
            for (i in 1 until numRows) {
                val numColumns = i + 1
                val columns = ArrayList<Int>(numColumns)
                for (j in 0 until numColumns) {
                    if (j == 0 || j == numColumns - 1) {
                        columns.add(1)
                        continue
                    }
                    val prevColumns = rows[i - 1]
                    columns.add(prevColumns[j - 1] + prevColumns[j])
                }
                rows.add(columns)
            }
            return rows[rows.size - 1]
        }
    },
    ;

    abstract fun getRow(rowIndex: Int): List<Int>
}
