from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def two_sum(self, numbers: list[int], target: int) -> list[int]:
        pass


class Default(Problem):
    @override
    def two_sum(self, numbers: list[int], target: int) -> list[int]:
        start = 0
        end = len(numbers) - 1
        while start < end:
            two_sum = numbers[start] + numbers[end]
            if two_sum > target:
                end -= 1
            elif two_sum < target:
                start += 1
            else:
                break  # found
        return [start + 1, end + 1]


SOLUTIONS: list[Problem] = [Default()]
