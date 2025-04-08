from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def merge(self, intervals: list[list[int]]) -> list[list[int]]:
        pass


class Default(Problem):
    @override
    def merge(self, intervals: list[list[int]]) -> list[list[int]]:
        intervals.sort(key=lambda array: array[0])
        new_intervals: list[list[int]] = [intervals[0]]
        for i in range(1, len(intervals)):
            last: list[int] = new_intervals[-1]
            if last[1] < intervals[i][0]:
                new_intervals.append(intervals[i])
                continue
            new_intervals.pop()
            new_intervals.append([
                last[0],
                max(last[1], intervals[i][1]),
            ])

        result: list[list[int]] = [[0] * 2 for _ in range(len(new_intervals))]
        for i, new_interval in enumerate(new_intervals):
            result[i] = new_interval
        return result


SOLUTIONS: list[Problem] = [Default()]
