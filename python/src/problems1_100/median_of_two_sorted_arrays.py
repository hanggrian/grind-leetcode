from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def find_median_sorted_arrays(self, nums1: list[int], nums2: list[int]) -> float:
        pass


class Default(Problem):
    @override
    def find_median_sorted_arrays(self, nums1: list[int], nums2: list[int]) -> float:
        nums: list[int] = nums1 + nums2
        nums.sort()
        center: int = len(nums) // 2
        if len(nums) % 2 == 1:
            return nums[center]
        return (nums[center - 1] + nums[center]) / 2


SOLUTIONS: list[Problem] = [Default()]
