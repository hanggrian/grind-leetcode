from typing import Optional

from .list_node import ListNode


class DoublyListNode(ListNode):
    def __init__(
        self,
        val: int = 0,
        next2: Optional['DoublyListNode'] = None,
        prev2: Optional['DoublyListNode'] = None,
    ):
        super().__init__(val)
        self.next: DoublyListNode | None = next2
        self.prev: DoublyListNode | None = prev2
