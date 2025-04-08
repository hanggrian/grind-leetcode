from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def word_break(self, s: str, word_dict: list[str]) -> bool:
        pass


class Default(Problem):
    @override
    def word_break(self, s: str, word_dict: list[str]) -> bool:
        dp: list[bool] = [False] * (len(s) + 1)
        dp[0] = True
        for right in range(1, len(dp)):
            for left in range(right):
                if not dp[left] or s[left:right] not in word_dict:
                    continue
                dp[right] = True
                break
        return dp[-1]


SOLUTIONS: list[Problem] = [Default()]
