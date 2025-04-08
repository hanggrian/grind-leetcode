from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def rotate(self, nums: list[int], k: int) -> None:
        pass


class Default(Problem):
    @override
    def rotate(self, nums: list[int], k: int) -> None:
        if k == 0 or k % len(nums) == 0:
            return
        if k > len(nums):
            k %= len(nums)
        self.reverse(nums, 0, len(nums) - 1)
        self.reverse(nums, 0, k - 1)
        self.reverse(nums, k, len(nums) - 1)

    def reverse(self, nums: list[int], left: int, right: int) -> None:
        while left < right:
            temp: int = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left += 1
            right -= 1


SOLUTIONS: list[Problem] = [Default()]
