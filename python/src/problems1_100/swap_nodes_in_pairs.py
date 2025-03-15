from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def swap_pairs(self, head: SinglyListNode | None) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def swap_pairs(self, head: SinglyListNode | None) -> SinglyListNode | None:
        root = SinglyListNode(0, head)
        current = root
        while current.next and current.next.next:
            node1 = current.next
            node2 = current.next.next
            node1.next = node2.next
            current.next = node2
            current.next.next = node1
            current = current.next.next
        return root.next


SOLUTIONS: list[Problem] = [Default()]
