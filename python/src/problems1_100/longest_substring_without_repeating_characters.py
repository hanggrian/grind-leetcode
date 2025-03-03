from abc import ABC, abstractmethod
from sys import maxsize
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
        characters = set()
        start = 0
        end = 0
        max_length = -maxsize
        while end < len(s):
            if s[end] not in characters:
                characters.add(s[end])
                end += 1
                max_length = max(max_length, len(characters))
                continue
            characters.remove(s[start])
            start += 1
        return max_length


SOLUTIONS: list[Problem] = [Default()]
