from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def can_jump(self, nums: list[int]) -> bool:
        pass


class Default(Problem):
    @override
    def can_jump(self, nums: list[int]) -> bool:
        goal = len(nums) - 1
        for i in range(len(nums) - 1, -1, -1):
            if i + nums[i] >= goal:
                goal = i
        return goal == 0


SOLUTIONS: list[Problem] = [Default()]
