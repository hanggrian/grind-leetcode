from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def minimum_total(self, triangle: list[list[int]]) -> int:
        pass


class Default(Problem):
    @override
    def minimum_total(self, triangle: list[list[int]]) -> int:
        max_row = len(triangle)
        max_col = 2

        dp = [[] for _ in range(max_row)]
        dp[0].append(triangle[0][0])
        row = 1
        col = 0

        while row < max_row:
            columns = []
            if col > 0:
                columns.append(triangle[row][col] + dp[row - 1][col - 1])
            if col < max_col - 1:
                columns.append(triangle[row][col] + dp[row - 1][col])
            dp[row].append(self.get_minimum(columns))
            col += 1
            if col != max_col:
                continue
            col = 0
            row += 1
            max_col += 1
        return self.get_minimum(dp[-1])

    def get_minimum(self, columns: list[int]) -> int:
        minimum = columns[0]
        for i in range(1, len(columns)):
            if columns[i] < minimum:
                minimum = columns[i]
        return minimum


SOLUTIONS: list[Problem] = [Default()]
