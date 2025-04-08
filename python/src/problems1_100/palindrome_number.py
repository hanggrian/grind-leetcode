from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def is_palindrome(self, x: int) -> bool:
        pass


class ReverseString(Problem):
    @override
    def is_palindrome(self, x: int) -> bool:
        s: str = str(x)
        return s == s[::-1]


class CompareHalfString(Problem):
    @override
    def is_palindrome(self, x: int) -> bool:
        s: str = str(x)
        start: int = 0
        end: int = len(s) - 1
        while start < end:
            if s[start] != s[end]:
                return False
            start += 1
            end -= 1
        return True


SOLUTIONS: list[Problem] = [ReverseString(), CompareHalfString()]
