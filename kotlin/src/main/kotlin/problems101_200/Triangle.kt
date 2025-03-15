package problems101_200

enum class Triangle {
    DEFAULT {
        override fun minimumTotal(triangle: List<List<Int>>): Int {
            val maxRow = triangle.size
            var maxCol = 2

            val dp = ArrayList<MutableList<Int>>(maxRow)
            for (i in 0 until maxRow) {
                dp.add(ArrayList())
            }
            dp[0].add(triangle[0][0])
            var row = 1
            var col = 0

            while (row < maxRow) {
                val columns = arrayListOf<Int>()
                if (col > 0) {
                    columns += triangle[row][col] + dp[row - 1][col - 1]
                }
                if (col < maxCol - 1) {
                    columns += triangle[row][col] + dp[row - 1][col]
                }
                dp[row] += getMinimum(columns)
                col++
                if (col != maxCol) {
                    continue
                }
                col = 0
                row++
                maxCol++
            }
            return getMinimum(dp[dp.size - 1])
        }

        fun getMinimum(columns: List<Int>): Int {
            var minimum = columns[0]
            for (i in 1 until columns.size) {
                if (columns[i] < minimum) {
                    minimum = columns[i]
                }
            }
            return minimum
        }
    },
    ;

    abstract fun minimumTotal(triangle: List<List<Int>>): Int
}
