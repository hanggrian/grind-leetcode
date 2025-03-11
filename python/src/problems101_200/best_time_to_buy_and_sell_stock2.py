from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def max_profit(self, prices: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def max_profit(self, prices: list[int]) -> int:
        profit = 0
        hold = False
        for i in range(len(prices)):
            if i != len(prices) - 1 and prices[i + 1] > prices[i]:
                if not hold:
                    hold = True
                    profit -= prices[i]
                continue
            if not hold:
                continue
            hold = False
            profit += prices[i]
        return profit


SOLUTIONS: list[Problem] = [Default()]
