from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int):
        pass


class Default(Problem):
    @override
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int):
        if n >= 0:
            nums1[m:m + n] = nums2[0:n]
        nums1.sort()


SOLUTIONS: list[Problem] = [Default()]
