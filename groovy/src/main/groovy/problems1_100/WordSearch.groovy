package problems1_100

enum WordSearch {
    DEFAULT{
        @Override
        boolean exist(char[][] board, String word) {
            var rows = board.length
            var cols = board[0].length
            for (var row = 0; row < rows; row++) {
                for (var col = 0; col < cols; col++) {
                    if (board[row][col] == word.charAt(0)
                        && dfs(board, new boolean[rows][cols], word, row, col)) {
                        return true
                    }
                }
            }
            return false
        }

        boolean dfs(char[][] board, boolean[][] visited, String word, int row, int col) {
            if (row < 0 || row > board.length - 1
                || col < 0 || col > board[0].length - 1
                || visited[row][col] || word.isEmpty() || word.charAt(0) != board[row][col]) {
                return word.isEmpty()
            }
            word = word.substring(1)
            visited[row][col] = true
            if (dfs(board, visited, word, row - 1, col)
                || dfs(board, visited, word, row + 1, col)
                || dfs(board, visited, word, row, col - 1)
                || dfs(board, visited, word, row, col + 1)) {
                return true
            }

            visited[row][col] = false
            return false
        }
    }

    abstract boolean exist(char[][] board, String word)
}
