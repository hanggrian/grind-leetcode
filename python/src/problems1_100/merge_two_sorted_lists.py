from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def merge_two_lists(
        self,
        l1: SinglyListNode | None,
        l2: SinglyListNode | None,
    ) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def merge_two_lists(
        self,
        l1: SinglyListNode | None,
        l2: SinglyListNode | None,
    ) -> SinglyListNode | None:
        if not l1:
            return l2
        if not l2:
            return l1
        root = SinglyListNode()
        current = root
        # when both items are there
        while l1 and l2:
            if l1.value < l2.value:
                current.next = SinglyListNode(l1.value)
                l1 = l1.next
            else:
                current.next = SinglyListNode(l2.value)
                l2 = l2.next
            current = current.next
        # remaining
        current.next = l1 or l2
        return root.next


SOLUTIONS: list[Problem] = [Default()]
