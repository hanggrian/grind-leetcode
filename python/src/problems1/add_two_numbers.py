from abc import ABC, abstractmethod
from typing import override

from src.concepts.list_nodes import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def add_two_numbers(self, l1: SinglyListNode, l2: SinglyListNode) -> SinglyListNode:
        pass


class Default(Problem):
    @override
    def add_two_numbers(self, l1: SinglyListNode, l2: SinglyListNode) -> SinglyListNode:
        root = SinglyListNode()
        node = root
        carry = 0
        while l1 or l2:
            # calculate total and carry
            val = carry
            if l1:
                val += l1.value
                l1 = l1.next
            if l2:
                val += l2.value
                l2 = l2.next
            carry = val // 10

            # create list
            node.next = SinglyListNode(val % 10)
            node = node.next
        # create remaining carry
        if carry > 0:
            node.next = SinglyListNode(carry)
        return root.next


SOLUTIONS: list[Problem] = [Default()]
