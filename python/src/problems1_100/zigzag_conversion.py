from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def convert(self, s: str, num_rows: int) -> str:
        pass


class Default(Problem):
    @override
    def convert(self, s: str, num_rows: int) -> str:
        if num_rows == 1:
            return s

        results = []
        for _ in range(num_rows):
            results.append('')

        i = 0
        zigzag_index = 0
        while len(s) > 0:
            if zigzag_index in [0, i]:
                c = s[0:1]
                s = s[1:]
                results[i] += c
            else:
                results[i] += ' '
            if i == num_rows - 1:
                i = 0
                if zigzag_index == 0:
                    zigzag_index = num_rows - 2
                else:
                    zigzag_index -= 1
                continue
            i += 1
        return ''.join(r.replace(' ', '') for r in results)


SOLUTIONS: list[Problem] = [Default()]
