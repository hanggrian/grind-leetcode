from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def length_of_last_word(self, s: str) -> bool:
        pass


class Default(Problem):
    @override
    def length_of_last_word(self, s: str) -> bool:
        chars: list[str] = list(s)
        for i in range(len(chars) // 2):
            temp = chars[i]
            chars[i] = chars[len(chars) - 1 - i]
            chars[len(chars) - 1 - i] = temp

        count = 0
        start_counting = False
        for c in chars:
            if c == ' ':
                if start_counting:
                    break
            else:
                start_counting = True
            if start_counting:
                count += 1

        return count


SOLUTIONS: list[Problem] = [Default()]
