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
        current = head
        while current and current.next:
            if current.value == current.next.value:
                current.next = current.next.next
            else:
                current = current.next
        return head


SOLUTIONS: list[Problem] = [Default()]
