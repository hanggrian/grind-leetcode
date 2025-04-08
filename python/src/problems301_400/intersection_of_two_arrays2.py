from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def intersect(self, nums1: list[int], nums2: list[int]) -> list[int]:
        pass


class Default(Problem):
    @override
    def intersect(self, nums1: list[int], nums2: list[int]) -> list[int]:
        nums1.sort()
        nums2.sort()

        i: int = 0
        j: int = 0
        result: list[int] = []
        while i < len(nums1) and j < len(nums2):
            if nums1[i] < nums2[j]:
                i += 1
            elif nums1[i] > nums2[j]:
                j += 1
            else:
                result.append(nums1[i])
                i += 1
                j += 1
        return result


SOLUTIONS: list[Problem] = [Default()]
