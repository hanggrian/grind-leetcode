package problems1_100

enum ValidSudoku {
    DEFAULT{
        @Override
        boolean isValidSudoku(char[][] board) {
            HashSet<Character> rows = []
            HashSet<Character> cols = []
            HashSet<Character> subBoard = []
            for (int i = 0; i < 9; i++) {
                rows.clear()
                cols.clear()
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.' as char && !rows.add(board[i][j])) {
                        return false
                    }
                    if (board[j][i] != '.' as char && !cols.add(board[j][i])) {
                        return false
                    }
                    if (i % 3 != 0 || j % 3 != 0) {
                        continue
                    }
                    subBoard.clear()
                    for (int i2 = i; i2 < i + 3; i2++) {
                        for (int j2 = j; j2 < j + 3; j2++) {
                            if (board[i2][j2] != '.' as char && !subBoard.add(board[i2][j2])) {
                                return false
                            }
                        }
                    }
                }
            }
            return true
        }
    }

    abstract boolean isValidSudoku(char[][] board)
}
