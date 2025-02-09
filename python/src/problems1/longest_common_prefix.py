from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def longest_common_prefix(self, strs: list[str]) -> str:
        pass


class Default(Problem):
    @override
    def longest_common_prefix(self, strs: list[str]) -> str:
        if len(strs) == 0:
            return ''
        if len(strs) == 1:
            return strs[0]
        longest_str = max(strs, key=len)
        end = -1
        for i, c in enumerate(longest_str):
            for j, s in enumerate(strs):
                if i >= len(s) or c != s[i]:
                    return longest_str[:i]
                if j == len(strs) - 1:
                    end = i
        return longest_str[:end + 1]


SOLUTIONS: list[Problem] = [Default()]
