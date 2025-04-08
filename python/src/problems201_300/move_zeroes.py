from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def move_zeroes(self, nums: list[int]) -> None:
        pass


class Default(Problem):
    @override
    def move_zeroes(self, nums: list[int]) -> None:
        i: int = 0
        for j in range(i + 1, len(nums)):
            if nums[i] == 0 and nums[j] != 0:
                temp: int = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                i += 1
            elif nums[i] != 0:
                i += 1


SOLUTIONS: list[Problem] = [Default()]
