from abc import ABC, abstractmethod
from typing import override

from src.concepts.list_nodes import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def delete_duplicates(self, head: SinglyListNode) -> SinglyListNode:
        pass


class Default(Problem):
    @override
    def delete_duplicates(self, head: SinglyListNode) -> SinglyListNode:
        root = SinglyListNode(-101, head)
        previous = root
        current = head
        while current:
            if current.next and current.value == current.next.value:
                while current.next and current.value == current.next.value:
                    current = current.next
                previous.next = current.next
            else:
                previous = previous.next
            current = current.next
        return root.next


SOLUTIONS: list[Problem] = [Default()]
