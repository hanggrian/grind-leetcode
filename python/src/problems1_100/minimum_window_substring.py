from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def min_window(self, s: str, t: str) -> str:
        pass


class Default(Problem):
    @override
    def min_window(self, s: str, t: str) -> str:
        if len(t) > len(s):
            return ''

        s_map: list[int] = [0] * 128
        t_map: list[int] = [0] * 128
        for c in t:
            t_map[ord(c)] += 1

        left: int = 0
        right: int = 0
        result: str = ''
        while right < len(s):
            s_map[ord(s[right])] += 1
            right += 1
            while left <= right and self.contains(s_map, t_map):
                current_substring = s[left:right]
                result = self.get_min_length(result, current_substring)
                s_map[ord(s[left])] -= 1
                left += 1
        return result

    def get_min_length(self, s1: str, s2: str) -> str:
        if len(s1) == 0 or len(s1) > len(s2):
            return s2
        return s1

    def contains(self, s_map: list[int], t_map: list[int]) -> bool:
        for i, m in enumerate(t_map):
            if m > s_map[i]:
                return False
        return True


SOLUTIONS: list[Problem] = [Default()]
