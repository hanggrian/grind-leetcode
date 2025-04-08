from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def max_sub_array(self, nums: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def max_sub_array(self, nums: list[int]) -> int:
        current: int = 0
        array_sum: int = nums[0]
        for num in nums:
            current = max(current, 0)
            current += num
            array_sum = max(array_sum, current)
        return array_sum


SOLUTIONS: list[Problem] = [Default()]
