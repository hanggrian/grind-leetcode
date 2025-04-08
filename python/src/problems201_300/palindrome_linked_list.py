from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def is_palindrome(self, head: SinglyListNode | None) -> bool:
        pass


class Default(Problem):
    @override
    def is_palindrome(self, head: SinglyListNode | None) -> bool:
        slow: SinglyListNode | None = head
        fast: SinglyListNode | None = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        right = self.reverse(slow)
        slow.next = None  # sever
        left = head

        while left and right:
            if left.val != right.val:
                return False
            left = left.next
            right = right.next
        return True

    def reverse(self, node: SinglyListNode | None) -> SinglyListNode | None:
        previous: SinglyListNode | None = None
        current: SinglyListNode | None = node
        while current:
            next_node: SinglyListNode | None = current.next
            current.next = previous
            previous = current
            current = next_node
        return previous


SOLUTIONS: list[Problem] = [Default()]
