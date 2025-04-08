from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def jump(self, nums: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def jump(self, nums: list[int]) -> int:
        steps: int = 0
        max_last_jump: int = 0
        max_current_jump: int = 0
        for i in range(len(nums) - 1):
            max_current_jump = max(max_current_jump, i + nums[i])
            if i != max_last_jump:
                continue
            steps += 1
            max_last_jump = max_current_jump
        return steps


SOLUTIONS: list[Problem] = [Default()]
