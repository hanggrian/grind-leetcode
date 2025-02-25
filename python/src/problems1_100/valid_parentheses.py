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
        symbols = []
        for c in s:
            if c in {')', '}', ']'}:
                if len(symbols) > 0 and symbols[-1] == '(' and c == ')':
                    symbols.pop()
                elif len(symbols) > 0 and symbols[-1] == '[' and c == ']':
                    symbols.pop()
                elif len(symbols) > 0 and symbols[-1] == '{' and c == '}':
                    symbols.pop()
                else:
                    return False
            else:
                symbols.append(c)
        return len(symbols) == 0


SOLUTIONS: list[Problem] = [Default()]
