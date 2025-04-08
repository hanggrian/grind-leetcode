from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def rob(self, nums: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def rob(self, nums: list[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        moneys: list[int] = [0] * len(nums)
        moneys[0] = nums[0]
        moneys[1] = max(nums[0], nums[1])
        for i in range(2, len(nums)):
            moneys[i] = max(nums[i] + moneys[i - 2], moneys[i - 1])
        return moneys[-1]


SOLUTIONS: list[Problem] = [Default()]
