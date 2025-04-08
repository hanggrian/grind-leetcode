from abc import ABC, abstractmethod
from collections import OrderedDict
from typing import override


class Problem(ABC):
    @abstractmethod
    def first_uniq_char(self, s: str) -> int:
        pass


class Default(Problem):
    @override
    def first_uniq_char(self, s: str) -> int:
        mp: OrderedDict[str][int] = OrderedDict[str]()
        for c in s:
            mp[c] = mp.get(c, 0) + 1
        for c in mp.keys():
            if mp[c] == 1:
                return s.find(c)
        return -1


SOLUTIONS: list[Problem] = [Default()]
