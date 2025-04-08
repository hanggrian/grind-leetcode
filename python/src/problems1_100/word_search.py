from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def exist(self, board: list[list[str]], word: str) -> bool:
        pass


class Default(Problem):
    @override
    def exist(self, board: list[list[str]], word: str) -> bool:
        rows: int = len(board)
        cols: int = len(board[0])
        for row in range(rows):
            for col in range(cols):
                if board[row][col] == word[0] and \
                    self.dfs(board, [[False] * cols for _ in range(rows)], word, row, col):
                    return True
        return False

    def dfs(
        self,
        board: list[list[str]],
        visited: list[list[bool]],
        word: str,
        row: int,
        col: int,
    ) -> bool:
        if row < 0 or row > len(board) - 1 or \
            col < 0 or col > len(board[0]) - 1 or \
            visited[row][col] or len(word) == 0 or word[0] != board[row][col]:
            return len(word) == 0

        word = word[1:]
        visited[row][col] = True
        if self.dfs(board, visited, word, row - 1, col) or \
            self.dfs(board, visited, word, row + 1, col) or \
            self.dfs(board, visited, word, row, col - 1) or \
            self.dfs(board, visited, word, row, col + 1):
            return True

        visited[row][col] = False
        return False


SOLUTIONS: list[Problem] = [Default()]
