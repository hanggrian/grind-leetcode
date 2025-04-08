from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def rotate_right(self, head: SinglyListNode | None, k: int) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def rotate_right(self, head: SinglyListNode | None, k: int) -> SinglyListNode | None:
        if not head or k == 0:
            return head
        root: SinglyListNode = SinglyListNode(0, head)

        # move left pointer, resetting if reached end
        left: SinglyListNode | None = root
        for _ in range(k):
            left = left.next
            if not left:
                left = root.next

        # get n-th from last, keeping previous node
        right: SinglyListNode | None = root
        previous_right: SinglyListNode | None = None
        while left:
            left = left.next
            next_right = right.next
            previous_right = right
            right = next_right

        # sever middle, set last of right to start of left
        previous_right.next = None
        last_right = right
        while last_right.next:
            last_right = last_right.next
        last_right.next = root.next

        return right


SOLUTIONS: list[Problem] = [Default()]
