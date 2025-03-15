from typing import Optional

from .list_node import ListNode


class DoublyListNode(ListNode):
    def __init__(
        self,
        value: int = 0,
        next2: Optional['DoublyListNode'] = None,
        prev2: Optional['DoublyListNode'] = None,
    ):
        super().__init__(value)
        self.next: DoublyListNode | None = next2
        self.prev: DoublyListNode | None = prev2
