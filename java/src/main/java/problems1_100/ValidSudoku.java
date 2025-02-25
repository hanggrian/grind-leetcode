package problems1_100;

import java.util.HashSet;
import java.util.Set;

enum ValidSudoku {
    DEFAULT {
        @Override
        boolean isValidSudoku(char[][] board) {
            Set<Character> rows = new HashSet<>();
            Set<Character> cols = new HashSet<>();
            Set<Character> subBoard = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                rows.clear();
                cols.clear();
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.' && !rows.add(board[i][j])) {
                        return false;
                    }
                    if (board[j][i] != '.' && !cols.add(board[j][i])) {
                        return false;
                    }
                    if (i % 3 != 0 || j % 3 != 0) {
                        continue;
                    }
                    subBoard.clear();
                    for (int i2 = i; i2 < i + 3; i2++) {
                        for (int j2 = j; j2 < j + 3; j2++) {
                            if (board[i2][j2] != '.' && !subBoard.add(board[i2][j2])) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
    };

    abstract boolean isValidSudoku(char[][] board);
}
