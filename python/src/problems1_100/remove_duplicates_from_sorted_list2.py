from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def delete_duplicates(self, head: SinglyListNode | None) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def delete_duplicates(self, head: SinglyListNode | None) -> SinglyListNode | None:
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
