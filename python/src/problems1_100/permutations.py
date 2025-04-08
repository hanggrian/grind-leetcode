from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def permute(self, nums: list[int]) -> list[list[int]]:
        pass


class Default(Problem):
    @override
    def permute(self, nums: list[int]) -> list[list[int]]:
        result: list[list[int]] = []
        self.permutation(result, nums, [])
        return result

    def permutation(self, result: list[list[int]], nums: list[int], prefix: list[int]) -> None:
        if len(nums) == 0:
            result.append(prefix)
            return
        for i, num in enumerate(nums):
            new_prefix: list[int] = prefix.copy()
            new_prefix.append(num)
            self.permutation(
                result,
                nums[0:i] + nums[i + 1:len(nums)],
                new_prefix,
            )


SOLUTIONS: list[Problem] = [Default()]
