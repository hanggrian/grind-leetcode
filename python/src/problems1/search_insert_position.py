from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def search_insert(self, nums: list[int], target: int) -> int:
        pass


class SlidingWindow(Problem):
    @override
    def search_insert(self, nums: list[int], target: int) -> int:
        start = 0
        end = len(nums) - 1
        while start <= end:
            center = (start + end) // 2
            if nums[center] < target:
                start = center + 1
            elif nums[center] > target:
                end = center - 1
            else:
                return center
        return end + 1


class BinarySearch(Problem):
    @override
    def search_insert(self, nums: list[int], target: int) -> int:
        return self.binary_search(nums, target, 0, len(nums) - 1)

    def binary_search(self, nums: list[int], target: int, start: int, end: int) -> int:
        center = (start + end) // 2
        if start > end:
            return end + 1
        if nums[center] < target:
            return self.binary_search(nums, target, center + 1, end)
        if nums[center] > target:
            return self.binary_search(nums, target, start, center - 1)
        return center


SOLUTIONS: list[Problem] = [BinarySearch()]
