from abc import ABC, abstractmethod
from sys import maxsize
from typing import override


class Problem(ABC):
    @abstractmethod
    def max_profit(self, prices: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def max_profit(self, prices: list[int]) -> int:
        min_price = maxsize
        max_profit = 0
        for price in prices:
            if price < min_price:
                min_price = price
                continue
            profit = price - min_price
            max_profit = max(profit, max_profit)
        return max_profit


SOLUTIONS: list[Problem] = [Default()]
