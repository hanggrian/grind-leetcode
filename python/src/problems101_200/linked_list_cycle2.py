from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def detect_cycle(self, head: SinglyListNode | None) -> SinglyListNode | None:
        pass


class RememberVisits(Problem):
    @override
    def detect_cycle(self, head: SinglyListNode | None) -> SinglyListNode | None:
        # visited nodes
        visits = set()
        current = head
        for node in head:
            if node in visits:
                return current
            visits.add(node)
            current = current.next
        return current


class FastSlowPointers(Problem):
    @override
    def detect_cycle(self, head: SinglyListNode | None) -> SinglyListNode | None:
        if not head or not head.has_next():
            return None
        slow = head.next
        fast = head.next.next
        while fast and fast.next and slow != fast:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                break

        if not slow or not slow.next:
            return None
        left = head
        right = slow
        while left != right:
            left = left.next
            right = right.next
        return left


SOLUTIONS: list[Problem] = [RememberVisits(), FastSlowPointers()]
