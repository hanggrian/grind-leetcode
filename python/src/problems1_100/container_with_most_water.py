from abc import ABC, abstractmethod
from sys import maxsize
from typing import override


class Problem(ABC):
    @abstractmethod
    def max_area(self, height: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def max_area(self, height: list[int]) -> int:
        start: int = 0
        end: int = len(height) - 1
        max_area: int = -maxsize - 1
        while start < end:
            wall: int = min(height[start], height[end])
            max_area = max(max_area, (end - start) * wall)
            if height[start] < height[end]:
                start += 1
            else:
                end -= 1
        return max_area


SOLUTIONS: list[Problem] = [Default()]
