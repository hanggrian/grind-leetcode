from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def number_of_arithmetic_slices(self, nums: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def number_of_arithmetic_slices(self, nums: list[int]) -> int:
        if len(nums) < 3:
            return 0
        slices: list[int] = [0] * len(nums)
        slices[0] = 0
        result: int = 0
        for i in range(2, len(nums)):
            if nums[i] - nums[i - 1] != nums[i - 1] - nums[i - 2]:
                continue
            slices[i] = slices[i - 1] + 1
            result += slices[i]
        return result


SOLUTIONS: list[Problem] = [Default()]
