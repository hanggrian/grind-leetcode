from sys import maxsize
from typing import Optional

from .list_node import ListNode


class SinglyListNode(ListNode):
    def __init__(
        self,
        value: int = 0,
        next2: Optional['SinglyListNode'] = None,
    ):
        super().__init__(value)
        self.next: SinglyListNode | None = next2

    @staticmethod
    def of(*values: int) -> Optional['SinglyListNode']:
        if len(values) == 0:
            return None
        head: SinglyListNode = SinglyListNode(values[0])
        next2: SinglyListNode = head
        for val in values[1:]:
            next2.next = SinglyListNode(val)
            next2 = next2.next
        return head


SINGLY_LIST_NODE_MAX: SinglyListNode = SinglyListNode(maxsize)
SINGLY_LIST_NODE_ZERO: SinglyListNode = SinglyListNode(0)
