from abc import ABC, abstractmethod
from typing import override

from src.concepts.list_nodes import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def reorder_list(self, head: SinglyListNode):
        pass


class Default(Problem):
    @override
    def reorder_list(self, head: SinglyListNode):
        mid = self.get_mind(head)
        right = self.reverse(mid)
        mid.next = None
        left = head

        curent = SinglyListNode()
        flag = True
        while left and right:
            if flag:
                curent.next = left
                left = left.next
            else:
                curent.next = right
                right = right.next
            curent = curent.next
            flag = not flag

    def reverse(self, node: SinglyListNode) -> SinglyListNode:
        previous = None
        current = node
        while current:
            temp = current.next
            current.next = previous
            previous = current
            current = temp
        return previous

    def get_mind(self, node: SinglyListNode) -> SinglyListNode:
        slow = node
        fast = node
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow


SOLUTIONS: list[Problem] = [Default()]
