from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def plus_one(self, digits: list[int]) -> list[int]:
        pass


class Default(Problem):
    @override
    def plus_one(self, digits: list[int]) -> list[int]:
        carry = 0
        for i in range(len(digits) - 1, -1, -1):
            if i == len(digits) - 1:
                digits[i] = digits[i] + 1
            digits[i] = digits[i] + carry
            carry = digits[i] // 10
            digits[i] = digits[i] % 10
        if carry == 1:
            digits2 = [0] * (len(digits) + 1)
            digits2[0] = 1
            digits2[1:] = digits[0:len(digits)]
            return digits2
        return digits


SOLUTIONS: list[Problem] = [Default()]
