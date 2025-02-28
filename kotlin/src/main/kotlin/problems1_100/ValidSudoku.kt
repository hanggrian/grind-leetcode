package problems1_100

enum class ValidSudoku {
    DEFAULT {
        override fun isValidSudoku(board: Array<CharArray>): Boolean {
            val rows = hashSetOf<Char>()
            val cols = hashSetOf<Char>()
            val subBoard = hashSetOf<Char>()
            for (i in 0 until 9) {
                rows.clear()
                cols.clear()
                for (j in 0 until 9) {
                    if (board[i][j] != '.' && !rows.add(board[i][j])) {
                        return false
                    }
                    if (board[j][i] != '.' && !cols.add(board[j][i])) {
                        return false
                    }
                    if (i % 3 != 0 || j % 3 != 0) {
                        continue
                    }
                    subBoard.clear()
                    for (i2 in i until i + 3) {
                        for (j2 in j until j + 3) {
                            if (board[i2][j2] != '.' && !subBoard.add(board[i2][j2])) {
                                return false
                            }
                        }
                    }
                }
            }
            return true
        }
    },
    ;

    abstract fun isValidSudoku(board: Array<CharArray>): Boolean
}
