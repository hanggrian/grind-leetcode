from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def is_palindrome(self, s: str) -> bool:
        pass


class ReverseString(Problem):
    @override
    def is_palindrome(self, s: str) -> bool:
        builder: str = ''
        for c in s:
            if c.isalnum():
                builder += c

        return builder.lower() == builder.lower()[::-1]


class CompareHalfString(Problem):
    @override
    def is_palindrome(self, s: str) -> bool:
        builder: str = ''
        for c in s:
            if c.isalnum():
                builder += c

        s: str = builder
        start: int = 0
        end: int = len(s) - 1
        while start < end:
            if s[start].lower() != s[end].lower():
                return False
            start += 1
            end -= 1
        return True


SOLUTIONS: list[Problem] = [ReverseString(), CompareHalfString()]
