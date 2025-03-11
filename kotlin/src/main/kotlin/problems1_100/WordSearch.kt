package problems1_100

enum class WordSearch {
    DEFAULT {
        override fun exist(board: Array<CharArray>, word: String): Boolean {
            val rows = board.size
            val cols = board[0].size
            for (row in 0 until rows) {
                for (col in 0 until cols) {
                    if (board[row][col] == word[0] &&
                        dfs(board, Array(rows) { BooleanArray(cols) }, word, row, col)
                    ) {
                        return true
                    }
                }
            }
            return false
        }

        fun dfs(
            board: Array<CharArray>,
            visited: Array<BooleanArray>,
            word: String,
            row: Int,
            col: Int,
        ): Boolean {
            var word = word

            if (row < 0 ||
                row > board.size - 1 ||
                col < 0 ||
                col > board[0].size - 1 ||
                visited[row][col] ||
                word.isEmpty() ||
                word[0] != board[row][col]
            ) {
                return word.isEmpty()
            }
            word = word.substring(1)
            visited[row][col] = true
            if (dfs(board, visited, word, row - 1, col) ||
                dfs(board, visited, word, row + 1, col) ||
                dfs(board, visited, word, row, col - 1) ||
                dfs(board, visited, word, row, col + 1)
            ) {
                return true
            }

            visited[row][col] = false
            return false
        }
    },
    ;

    abstract fun exist(board: Array<CharArray>, word: String): Boolean
}
