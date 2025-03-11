from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def sort_colors(self, nums: list[int]):
        pass


class Default(Problem):
    @override
    def sort_colors(self, nums: list[int]):
        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if nums[j] >= nums[i]:
                    continue
                temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp


SOLUTIONS: list[Problem] = [Default()]
