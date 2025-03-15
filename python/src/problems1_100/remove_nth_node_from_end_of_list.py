from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def remove_nth_from_end(self, head: SinglyListNode | None, n: int) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def remove_nth_from_end(self, head: SinglyListNode | None, n: int) -> SinglyListNode | None:
        if not head.next and n == 1:
            return None
        root = SinglyListNode(0, head)
        left = root
        right = root
        for _ in range(n):
            left = left.next
        while left.next:
            left = left.next
            right = right.next
        right.next = right.next.next
        return root.next


SOLUTIONS: list[Problem] = [Default()]
