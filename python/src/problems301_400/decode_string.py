from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def decode_string(self, s: str) -> str:
        pass


class Default(Problem):
    @override
    def decode_string(self, s: str) -> str:
        stack: list[str] = []
        for char in s:
            if char != ']':
                stack.append(char)
                continue
            content_builder: str = ''
            time_builder: str = ''
            while stack[-1] != '[':
                content_builder += stack.pop()
            stack.pop()  # remove '['
            while stack and stack[-1].isdigit():
                time_builder += stack.pop()

            content = content_builder[::-1]
            times = int(time_builder[::-1])

            for _ in range(times):
                for content_char in content:
                    stack.append(content_char)

        return ''.join(stack)


SOLUTIONS: list[Problem] = [Default()]
