from abc import ABC, abstractmethod
from typing import override

from src.concepts.list_nodes import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def has_cycle(self, head: SinglyListNode) -> bool:
        pass


class RememberVisits(Problem):
    @override
    def has_cycle(self, head: SinglyListNode) -> bool:
        # visited nodes
        visits = set()
        for node in head:
            if node in visits:
                return True
            visits.add(node)
        return False


class FastSlowPointers(Problem):
    @override
    def has_cycle(self, head: SinglyListNode) -> bool:
        if not head or not head.has_next():
            return False
        slow = head.next
        fast = head.next.next
        while fast and fast.has_next() and slow != fast:
            slow = slow.next
            fast = fast.next.next
        return slow == fast


SOLUTIONS: list[Problem] = [RememberVisits(), FastSlowPointers()]
