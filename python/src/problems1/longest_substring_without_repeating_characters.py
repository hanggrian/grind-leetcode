from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def length_of_longest_substring(self, s: str) -> int:
        pass


class Default(Problem):
    @override
    def length_of_longest_substring(self, s: str) -> int:
        if not s:
            return 0
        # unique characters
        chars = set()
        start = end = 0
        max_length = float('-inf')
        while end < len(s):
            if s[end] not in chars:
                chars.add(s[end])
                end += 1
                max_length = max(max_length, len(chars))
                continue
            chars.remove(s[start])
            start += 1
        return max_length


SOLUTIONS: list[Problem] = [Default()]
