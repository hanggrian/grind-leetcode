from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def sort_list(self, head: SinglyListNode | None) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def sort_list(self, head: SinglyListNode | None) -> SinglyListNode | None:
        if not head or not head.next:
            return head
        mid = self.split(head)
        return self.merge(
            self.sort_list(head),
            self.sort_list(mid),
        )

    def merge(
        self,
        node1: SinglyListNode | None,
        node2: SinglyListNode | None,
    ) -> SinglyListNode | None:
        root = SinglyListNode()
        current = root
        while node1 and node2:
            if node1.value < node2.value:
                current.next = node1
                node1 = node1.next
            else:
                current.next = node2
                node2 = node2.next
            current = current.next
        if node1:
            current.next = node1
        elif node2:
            current.next = node2
        return root.next

    def split(self, node: SinglyListNode | None) -> SinglyListNode | None:
        slow_orev = None
        slow = node
        fast = node
        while fast and fast.next:
            slow_orev = slow
            slow = slow.next
            fast = fast.next.next
        slow_orev.next = None
        return slow


SOLUTIONS: list[Problem] = [Default()]
