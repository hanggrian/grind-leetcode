from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def find_peak_element(self, nums: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def find_peak_element(self, nums: list[int]) -> int:
        start = 0
        end = len(nums) - 1
        while start < end:
            if nums[start] > nums[end]:
                end -= 1
            else:
                start += 1
        return nums[end]


SOLUTIONS: list[Problem] = [Default()]
