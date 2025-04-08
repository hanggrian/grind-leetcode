from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def island_perimeter(self, grid: list[list[int]]) -> int:
        pass


class Default(Problem):
    @override
    def island_perimeter(self, grid: list[list[int]]) -> int:
        rows: int = len(grid)
        cols: int = len(grid[0])

        islands: int = 0
        neighbors: int = 0
        for row in range(rows):
            for col in range(cols):
                if grid[row][col] != 1:
                    continue
                islands += 1
                if row - 1 >= 0 and grid[row - 1][col] == 1:
                    neighbors += 1
                if row + 1 < rows and grid[row + 1][col] == 1:
                    neighbors += 1
                if col - 1 >= 0 and grid[row][col - 1] == 1:
                    neighbors += 1
                if col + 1 < cols and grid[row][col + 1] == 1:
                    neighbors += 1
        return islands * 4 - neighbors


SOLUTIONS: list[Problem] = [Default()]
