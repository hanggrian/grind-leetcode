from abc import ABC, abstractmethod
from typing import override

from concepts.python.src.list_nodes import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def has_cycle(self, head: SinglyListNode) -> bool:
        pass


class RememberVisits(Problem):
    @override
    def has_cycle(self, head: SinglyListNode) -> bool:
        # visited nodes
        visits = set()
        node = head
        while node:
            if node in visits:
                return True
            visits.add(node)
            node = node.next
        return False


class FastSlowPointers(Problem):
    @override
    def has_cycle(self, head: SinglyListNode) -> bool:
        if not head or not head.next:
            return False
        slow, fast = head, head.next
        while fast and fast.next and slow != fast:
            slow = slow.next
            fast = fast.next.next
        return slow == fast


SOLUTIONS: list[Problem] = [RememberVisits(), FastSlowPointers()]
