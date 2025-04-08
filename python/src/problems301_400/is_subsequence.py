from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def is_subsequence(self, s: str, t: str) -> bool:
        pass


class Default(Problem):
    @override
    def is_subsequence(self, s: str, t: str) -> bool:
        if not s:
            return True
        if not t:
            return False
        si: int = 0
        ti: int = 0
        while ti < len(t):
            if s[si] == t[ti]:
                si += 1
                if si == len(s):
                    return True
            ti += 1
        return False


SOLUTIONS: list[Problem] = [Default()]
