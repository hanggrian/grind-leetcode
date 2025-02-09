from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def remove_element(self, nums: list[int], val: int) -> int:
        pass


class Default(Problem):
    @override
    def remove_element(self, nums: list[int], val: int) -> int:
        start = 0
        end = 0
        while start < len(nums):
            if nums[start] != val:
                nums[end] = nums[start]
                end += 1
            start += 1
        return end


SOLUTIONS: list[Problem] = [Default()]
