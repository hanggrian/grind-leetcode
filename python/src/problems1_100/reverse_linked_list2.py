from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def reverse_between(
        self,
        head: SinglyListNode | None,
        left: int,
        right: int,
    ) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def reverse_between(
        self,
        head: SinglyListNode | None,
        left: int,
        right: int,
    ) -> SinglyListNode | None:
        if left == right:
            return head

        root: SinglyListNode = SinglyListNode(0, head)
        center_start: SinglyListNode | None = root
        center_start_previous: SinglyListNode | None = None
        center_end: SinglyListNode | None = root
        for i in range(right):
            if i < left:
                center_start_previous = center_start
                center_start = center_start.next
            center_end = center_end.next

        excess: SinglyListNode | None = center_end.next
        center_start_previous.next = None
        center_end.next = None

        if left == 1:
            head = self.reverse(center_start)
            current = head
        else:
            current = self.traverse_until_end(head)
            current.next = self.reverse(center_start)

        current: SinglyListNode = self.traverse_until_end(current)
        current.next = excess
        return head

    def traverse_until_end(self, node: SinglyListNode | None) -> SinglyListNode | None:
        current: SinglyListNode = node
        while current.next:
            current = current.next
        return current

    def reverse(self, node: SinglyListNode) -> SinglyListNode:
        current: SinglyListNode = node
        previous: SinglyListNode | None = None
        while current:
            temp = current.next
            current.next = previous
            previous = current
            current = temp
        return previous


SOLUTIONS: list[Problem] = [Default()]
