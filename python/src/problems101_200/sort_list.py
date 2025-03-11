from abc import ABC, abstractmethod
from typing import override

from src.concepts.list_nodes import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def sort_list(self, head: SinglyListNode) -> SinglyListNode:
        pass


class Default(Problem):
    @override
    def sort_list(self, head: SinglyListNode) -> SinglyListNode:
        if not head or not head.next:
            return head
        mid = self.split(head)
        return self.merge(
            self.sort_list(head),
            self.sort_list(mid),
        )

    def merge(self, node1: SinglyListNode, node2: SinglyListNode) -> SinglyListNode:
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

    def split(self, node: SinglyListNode) -> SinglyListNode:
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
