from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def reverse_list(self, head: SinglyListNode | None) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def reverse_list(self, head: SinglyListNode | None) -> SinglyListNode | None:
        previous: SinglyListNode | None = None
        current: SinglyListNode | None = head
        while current:
            next_node: SinglyListNode | None = current.next
            current.next = previous
            previous = current
            current = next_node
        return previous


SOLUTIONS: list[Problem] = [Default()]
