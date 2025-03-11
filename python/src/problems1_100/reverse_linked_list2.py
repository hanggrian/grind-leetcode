from abc import ABC, abstractmethod
from typing import override

from src.concepts.list_nodes import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def reverse_between(self, head: SinglyListNode, left: int, right: int) -> SinglyListNode:
        pass


class Default(Problem):
    @override
    def reverse_between(self, head: SinglyListNode, left: int, right: int) -> SinglyListNode:
        if left == right:
            return head

        root = SinglyListNode(0, head)
        center_start = root
        center_start_previous = None
        center_end = root
        for i in range(right):
            if i < left:
                center_start_previous = center_start
                center_start = center_start.next
            center_end = center_end.next

        excess = center_end.next
        center_start_previous.next = None
        center_end.next = None

        if left == 1:
            head = self.reverse(center_start)
            current = head
        else:
            current = self.traverse_until_end(head)
            current.next = self.reverse(center_start)

        current = self.traverse_until_end(current)
        current.next = excess
        return head

    def traverse_until_end(self, node: SinglyListNode):
        current = node
        while current.next:
            current = current.next
        return current

    def reverse(self, node: SinglyListNode):
        current = node
        previous = None
        while current:
            temp = current.next
            current.next = previous
            previous = current
            current = temp
        return previous


SOLUTIONS: list[Problem] = [Default()]
