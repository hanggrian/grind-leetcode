from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def is_anagram(self, s: str, t: str) -> bool:
        pass


class Default(Problem):
    @override
    def is_anagram(self, s: str, t: str) -> bool:
        if len(t) > len(s):
            return False
        mp = [0] * 128
        for c in s:
            mp[ord(c)] += 1
        for c in t:
            mp[ord(c)] -= 1
        for i in mp:
            if i > 0:
                return False
        return True


SOLUTIONS: list[Problem] = [Default()]
