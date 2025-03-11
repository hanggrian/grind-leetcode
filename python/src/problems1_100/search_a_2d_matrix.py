from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def search_matrix(self, matrix: list[list[int]], target: int) -> bool:
        pass


class Default(Problem):
    @override
    def search_matrix(self, matrix: list[list[int]], target: int) -> bool:
        row = 0
        if len(matrix) > 1:
            for i in range(len(matrix) - 1, -1, -1):
                if matrix[i][0] > target:
                    continue
                row = i
                break

        col = 0
        while col < len(matrix[0]) and matrix[row][col] <= target:
            if matrix[row][col] == target:
                return True
            col += 1
        return False


SOLUTIONS: list[Problem] = [Default()]
