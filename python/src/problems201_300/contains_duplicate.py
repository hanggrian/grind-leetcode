from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def contains_duplicate(self, nums: list[int]) -> bool:
        pass


class Default(Problem):
    @override
    def contains_duplicate(self, nums: list[int]) -> bool:
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                return True
        return False


SOLUTIONS: list[Problem] = [Default()]
