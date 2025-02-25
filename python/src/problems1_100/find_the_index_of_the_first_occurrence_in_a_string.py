from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def str_str(self, haystack: str, needle: str) -> int:
        pass


class Default(Problem):
    @override
    def str_str(self, haystack: str, needle: str) -> int:
        return haystack.find(needle)


SOLUTIONS: list[Problem] = [Default()]
