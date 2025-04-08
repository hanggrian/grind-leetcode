from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def reverse(self, x: int) -> int:
        pass


class Default(Problem):
    @override
    def reverse(self, x: int) -> int:
        negate: bool = False
        s: str = str(x)
        if s[0] == '-':
            s = s[1:]
            negate = True

        if negate:
            return -int(s[::-1])
        return int(s[::-1])


SOLUTIONS: list[Problem] = [Default()]
