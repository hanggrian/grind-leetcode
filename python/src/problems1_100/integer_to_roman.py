from abc import ABC, abstractmethod
from typing import override

from src.util.dicts import floor_key


class Problem(ABC):
    @abstractmethod
    def int_to_roman(self, num: int) -> str:
        pass


class Default(Problem):
    ROMANS: dict[int, str] = {
        1000: 'M',
        900: 'CM',
        500: 'D',
        400: 'CD',
        100: 'C',
        90: 'XC',
        50: 'L',
        40: 'XL',
        10: 'X',
        9: 'IX',
        5: 'V',
        4: 'IV',
        1: 'I',
    }

    @override
    def int_to_roman(self, num: int) -> str:
        return self.recurse(self.ROMANS, num)

    def recurse(self, romans: dict[int, str], num: int) -> str:
        floor: int = floor_key(romans, num)
        if num == floor:
            return romans[num]
        return romans[floor] + self.recurse(romans, num - floor)


SOLUTIONS: list[Problem] = [Default()]
