package problems1_100

enum class SearchA2dMatrix {
    DEFAULT {
        override fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            var row = 0
            if (matrix.size > 1) {
                for (i in matrix.indices.reversed()) {
                    if (matrix[i][0] > target) {
                        continue
                    }
                    row = i
                    break
                }
            }
            var col = 0
            while (col < matrix[0].size && matrix[row][col] <= target) {
                if (matrix[row][col] == target) {
                    return true
                }
                col++
            }
            return false
        }
    },
    ;

    abstract fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean
}
