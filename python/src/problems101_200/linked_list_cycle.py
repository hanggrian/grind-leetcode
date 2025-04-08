from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def has_cycle(self, head: SinglyListNode | None) -> bool:
        pass


class RememberVisits(Problem):
    @override
    def has_cycle(self, head: SinglyListNode | None) -> bool:
        # visited nodes
        visits: set[SinglyListNode] = set()
        for node in head:
            if node in visits:
                return True
            visits.add(node)
        return False


class FastSlowPointers(Problem):
    @override
    def has_cycle(self, head: SinglyListNode | None) -> bool:
        if not head or not head.has_next():
            return False
        slow: SinglyListNode | None = head.next
        fast: SinglyListNode | None = head.next.next
        while fast and fast.next and slow != fast:
            slow = slow.next
            fast = fast.next.next
        return slow == fast


SOLUTIONS: list[Problem] = [RememberVisits(), FastSlowPointers()]
