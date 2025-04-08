from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def word_break(self, s: str, word_dict: list[str]) -> list[str]:
        pass


class Default(Problem):
    @override
    def word_break(self, s: str, word_dict: list[str]) -> list[str]:
        return self.recurse_word_break(s, word_dict, {})

    def recurse_word_break(
        self,
        s: str,
        word_dict: list[str],
        map_dict: dict[str, list[str]],
    ) -> list[str]:
        if s in map_dict:
            return map_dict[s]
        result: list[str] = []
        for word in word_dict:
            if not s.startswith(word):
                continue
            next_s: str = s[len(word):]
            if not next_s:
                result.append(word)
                continue
            for sub in self.recurse_word_break(next_s, word_dict, map_dict):
                result.append(word + ' ' + sub)
        map_dict[s] = result
        return result


SOLUTIONS: list[Problem] = [Default()]
