from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def generate(self, num_rows: int) -> list[list[int]]:
        pass


class Default(Problem):
    @override
    def generate(self, num_rows: int) -> list[list[int]]:
        rows = [[0]] * num_rows
        rows[0] = [1]
        for i in range(1, num_rows):
            num_columns = i + 1
            columns = [0] * num_columns
            for j in range(num_columns):
                if j in {0, num_columns - 1}:
                    columns[j] = 1
                    continue
                prev_columns = rows[i - 1]
                columns[j] = prev_columns[j - 1] + prev_columns[j]
            rows[i] = columns
        return rows


SOLUTIONS: list[Problem] = [Default()]
