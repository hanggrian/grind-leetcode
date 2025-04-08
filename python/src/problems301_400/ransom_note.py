from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def can_construct(self, ransom_note: str, magazine: str) -> bool:
        pass


class Default(Problem):
    @override
    def can_construct(self, ransom_note: str, magazine: str) -> bool:
        mp: list[int] = [0] * 128
        for c in ransom_note:
            mp[ord(c)] += 1
        for c in magazine:
            mp[ord(c)] -= 1
        for i in mp:
            if i > 0:
                return False
        return True


SOLUTIONS: list[Problem] = [Default()]
