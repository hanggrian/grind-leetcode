from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def ladder_length(self, begin_word: str, end_word: str, word_list: list[str]) -> int:
        pass


class Default(Problem):
    @override
    def ladder_length(self, begin_word: str, end_word: str, word_list: list[str]) -> int:
        if end_word not in word_list:
            return 0

        # Python's set has O(1) lookup time
        word_set = set(word_list)

        queue = [begin_word]
        steps = 0
        while queue:
            for i in range(len(queue)):
                s = queue.pop(0)
                if s == end_word:
                    return steps + 1
                for j in range(len(s)):
                    word = list(s)
                    for c in range(ord('a'), ord('z') + 1):
                        word[j] = chr(c)
                        new_word = ''.join(word)
                        if s == new_word or new_word not in word_set:
                            continue
                        queue.append(new_word)
                        word_set.remove(new_word)
            steps += 1

        return 0


SOLUTIONS: list[Problem] = [Default()]
