from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def roman_to_int(self, s: str) -> int:
        pass


class Default(Problem):
    @override
    def roman_to_int(self, s: str) -> int:
        romans = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        result = 0
        for i in range(len(s)):
            c = s[i]
            if i > 0 and romans[c] > romans[s[i - 1]]:
                result += romans[c] - 2 * romans[s[i - 1]]
            else:
                result += romans[c]
        return result


SOLUTIONS: list[Problem] = [Default()]
