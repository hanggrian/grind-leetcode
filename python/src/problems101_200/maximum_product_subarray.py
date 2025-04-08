from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def max_product(self, nums: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def max_product(self, nums: list[int]) -> int:
        maxs: list[int] = [0] * len(nums)
        mins: list[int] = [0] * len(nums)
        maxs[0] = nums[0]
        mins[0] = nums[0]
        result: int = nums[0]
        for i in range(1, len(nums)):
            if nums[i] > 0:
                maxs[i] = max(maxs[i - 1] * nums[i], nums[i])
                mins[i] = min(mins[i - 1] * nums[i], nums[i])
            else:
                maxs[i] = min(mins[i - 1] * nums[i], nums[i])
                mins[i] = max(maxs[i - 1] * nums[i], nums[i])
            result = max(maxs[i], result)
        return result


SOLUTIONS: list[Problem] = [Default()]
