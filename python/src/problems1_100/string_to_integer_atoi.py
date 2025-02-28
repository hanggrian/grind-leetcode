from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def my_atoi(self, s: str) -> int:
        pass


class Default(Problem):
    @override
    def my_atoi(self, s: str) -> int:
        if not s:
            return 0
        s = s.strip()
        negate = False
        if s[0] == '-':
            s = s[1:]
            negate = True
        elif s[0] == '+':
            s = s[1:]

        result = ''
        for c in s:
            if c.isdigit():
                result += c
                continue
            break
        if negate:
            result = '-' + result
        if len(result) == 0 or \
            (len(result) == 1 and (result[0] == '-' or result[0] == '+')):
            return 0
        return int(result)


SOLUTIONS: list[Problem] = [Default()]
