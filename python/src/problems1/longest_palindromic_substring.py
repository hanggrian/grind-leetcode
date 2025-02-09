from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def longest_palindrome(self, s: str) -> str:
        pass


class Default(Problem):
    @override
    def longest_palindrome(self, s: str) -> str:
        if len(s) == 1:
            return s
        longest_palindrome = ''
        for i in range(len(s)):
            palindrome: str
            # check odd
            start = i
            end = i
            while start >= 0 and end < len(s) and s[start] == s[end]:
                palindrome = s[start:end + 1]
                if len(palindrome) > len(longest_palindrome):
                    longest_palindrome = palindrome
                start -= 1
                end += 1
            # check even
            start = i
            end = i + 1
            while start >= 0 and end < len(s) and s[start] == s[end]:
                palindrome = s[start:end + 1]
                if len(palindrome) > len(longest_palindrome):
                    longest_palindrome = palindrome
                start -= 1
                end += 1
        return longest_palindrome


SOLUTIONS: list[Problem] = [Default()]
