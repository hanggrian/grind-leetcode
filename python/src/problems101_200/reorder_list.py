from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def reorder_list(self, head: SinglyListNode | None) -> None:
        pass


class Default(Problem):
    @override
    def reorder_list(self, head: SinglyListNode | None) -> None:
        mid: SinglyListNode | None = self.get_mid(head)
        right: SinglyListNode | None = self.reverse(mid)
        mid.next = None
        left: SinglyListNode | None = head

        current: SinglyListNode = SinglyListNode()
        flag: bool = True
        while left and right:
            if flag:
                current.next = left
                left = left.next
            else:
                current.next = right
                right = right.next
            current = current.next
            flag = not flag

    def reverse(self, node: SinglyListNode | None) -> SinglyListNode | None:
        previous: SinglyListNode | None = None
        current: SinglyListNode | None = node
        while current:
            temp = current.next
            current.next = previous
            previous = current
            current = temp
        return previous

    def get_mid(self, node: SinglyListNode | None) -> SinglyListNode | None:
        slow: SinglyListNode = node
        fast: SinglyListNode | None = node
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow


SOLUTIONS: list[Problem] = [Default()]
