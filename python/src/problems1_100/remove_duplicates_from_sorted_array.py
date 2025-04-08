from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def remove_duplicates(self, nums: list[int]) -> int:
        pass


class CreateCopy(Problem):
    @override
    def remove_duplicates(self, nums: list[int]) -> int:
        distinct: set[int] = set(nums)
        i: int = 0
        for num in distinct:
            nums[i] = num
            i += 1
        return len(distinct)


class SinglePass(Problem):
    @override
    def remove_duplicates(self, nums: list[int]) -> int:
        start: int = 1
        end: int = 1
        while end < len(nums):
            if nums[end] != nums[end - 1]:
                nums[start] = nums[end]
                start += 1
            end += 1
        return start


SOLUTIONS: list[Problem] = [CreateCopy(), SinglePass()]
