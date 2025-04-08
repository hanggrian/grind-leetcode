from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def roman_to_int(self, s: str) -> int:
        pass


class Default(Problem):
    ROMANS: dict[str, int] = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000,
    }

    @override
    def roman_to_int(self, s: str) -> int:
        result: int = 0
        for i, c in enumerate(s):
            if i > 0 and self.ROMANS[c] > self.ROMANS[s[i - 1]]:
                result += self.ROMANS[c] - 2 * self.ROMANS[s[i - 1]]
            else:
                result += self.ROMANS[c]
        return result


SOLUTIONS: list[Problem] = [Default()]
