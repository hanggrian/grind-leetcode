from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def is_valid_sudoku(self, board: list[list[str]]) -> bool:
        pass


class Default(Problem):
    @override
    def is_valid_sudoku(self, board: list[list[str]]) -> bool:
        rows: set[str] = set()
        cols: set[str] = set()
        sub_board: set[set[str]] = set()
        for i in range(9):
            rows.clear()
            cols.clear()
            for j in range(9):
                if board[i][j] != '.' and board[i][j] in rows:
                    return False
                if board[j][i] != '.' and board[j][i] in cols:
                    return False
                rows.add(board[i][j])
                cols.add(board[j][i])
                if i % 3 != 0 or j % 3 != 0:
                    continue
                sub_board.clear()
                for i2 in range(i, i + 3):
                    for j2 in range(j, j + 3):
                        if board[i2][j2] != '.' and board[i2][j2] in sub_board:
                            return False
        return True


SOLUTIONS: list[Problem] = [Default()]
