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
        current = head
        while current and current.next:
            if current.value == current.next.value:
                current.next = current.next.next
            else:
                current = current.next
        return head


SOLUTIONS: list[Problem] = [Default()]
