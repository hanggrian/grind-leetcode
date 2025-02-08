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
            return ""
        if len(strs) == 1:
            return strs[0]
        longest_str = max(strs, key=len)
        end = -1
        for i in range(len(longest_str)):
            c = longest_str[i]
            for j in range(len(strs)):
                s = strs[j]
                if i >= len(s) or c != s[i]:
                    return longest_str[:i]
                elif j == len(strs) - 1:
                    end = i
        return longest_str[:end + 1]


SOLUTIONS: list[Problem] = [Default()]
