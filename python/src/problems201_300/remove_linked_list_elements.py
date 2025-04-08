from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def remove_elements(self, head: SinglyListNode | None, val: int) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def remove_elements(self, head: SinglyListNode | None, val: int) -> SinglyListNode | None:
        new_head: SinglyListNode = SinglyListNode()
        current_new: SinglyListNode = new_head
        current: SinglyListNode | None = head
        while current:
            if current.val != val:
                current_new.next = SinglyListNode(current.val)
                current_new = current_new.next
            current = current.next
        return new_head.next


SOLUTIONS: list[Problem] = [Default()]
