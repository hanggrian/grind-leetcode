from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def num_islands(self, grid: list[list[str]]) -> int:
        pass


class Default(Problem):
    @override
    def num_islands(self, grid: list[list[str]]) -> int:
        rows: int = len(grid)
        cols: int = len(grid[0])
        visited: list[list[bool]] = [[False for _ in range(cols)] for _ in range(rows)]

        islands: int = 0
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] != '1' or visited[row][col]:
                    continue
                self.dfs(grid, visited, row, col)
                islands += 1
        return islands

    def dfs(self, grid: list[list[str]], visited: list[list[bool]], row: int, col: int) -> None:
        if row < 0 or \
            row > len(grid) - 1 or \
            col < 0 or \
            col > len(grid[0]) - 1 or \
            grid[row][col] != '1' or \
            visited[row][col]:
            return
        visited[row][col] = True
        self.dfs(grid, visited, row - 1, col)
        self.dfs(grid, visited, row + 1, col)
        self.dfs(grid, visited, row, col - 1)
        self.dfs(grid, visited, row, col + 1)


SOLUTIONS: list[Problem] = [Default()]
