from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def single_number(self, nums: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def single_number(self, nums: list[int]) -> int:
        result: list[int] = []
        for num in nums:
            if num not in result:
                result.append(num)
            else:
                result.remove(num)
        return result[0]


SOLUTIONS: list[Problem] = [Default()]
