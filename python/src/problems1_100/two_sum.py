from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def two_sum(self, nums: list[int], target: int) -> list[int] | None:
        pass


class BruteForce(Problem):
    @override
    def two_sum(self, nums: list[int], target: int) -> list[int] | None:
        for i, num in enumerate(nums):
            complement: int = target - num
            if complement in nums[i + 1:]:
                return [i, nums.index(complement, i + 1)]
        return None


class SinglePass(Problem):
    @override
    def two_sum(self, nums: list[int], target: int) -> list[int] | None:
        # remaining to index mapping
        seen: dict[int, int] = {}
        for i, num in enumerate(nums):
            complement: int = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
        return [-1, -1]


SOLUTIONS: list[Problem] = [BruteForce(), SinglePass()]
