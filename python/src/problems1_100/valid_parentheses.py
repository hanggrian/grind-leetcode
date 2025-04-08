from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def is_valid(self, s: str) -> bool:
        pass


class Default(Problem):
    @override
    def is_valid(self, s: str) -> bool:
        if len(s) % 2 == 1:
            return False

        symbols: list[str] = []
        for c in s:
            if c not in {')', '}', ']'}:
                symbols.append(c)
                continue

            if len(symbols) > 0 and \
                ((symbols[-1] == '(' and c == ')') or
                 (symbols[-1] == '{' and c == '}') or
                 (symbols[-1] == '[' and c == ']')):
                symbols.pop()
                continue
            return False
        return len(symbols) == 0


SOLUTIONS: list[Problem] = [Default()]
