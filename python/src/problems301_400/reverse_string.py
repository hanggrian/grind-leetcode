from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def reverse_string(self, s: list[str]) -> None:
        pass


class Default(Problem):
    @override
    def reverse_string(self, s: list[str]) -> None:
        for left in range(len(s) // 2):
            right: int = len(s) - 1 - left
            temp: str = s[left]
            s[left] = s[right]
            s[right] = temp


SOLUTIONS: list[Problem] = [Default()]
