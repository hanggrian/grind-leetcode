from collections.abc import Iterable, Iterator
from sys import maxsize
from typing import Optional


class ListNode(Iterable):
    def __init__(self, value: int):
        self.value: int = value
        self.next: ListNode | None = None

    def has_next(self) -> bool:
        return self.next is not None

    def iterate_to(self, position: int) -> 'ListNode':
        node: ListNode = self
        for _ in range(position):
            node = node.next
        return node

    def iterate_last(self) -> 'ListNode':
        node: ListNode = self
        while node.has_next():
            node = node.next
        return node

    def __iter__(self) -> 'ListNode.ListNodeIterator':
        return self.ListNodeIterator(self)

    def __eq__(self, other: object) -> bool:
        if self is other:
            return True
        if not isinstance(other, ListNode):
            return False
        node1: ListNode = self
        node2: ListNode = other
        while node1 and node2:
            if node1.value != node2.value:
                return False
            node1 = node1.next
            node2 = node2.next
        return not node1 and not node2

    def __hash__(self) -> int:
        return hash(self.value)

    class ListNodeIterator(Iterator['ListNode']):
        def __init__(self, node: 'ListNode'):
            self.node = node

        def __next__(self) -> 'ListNode':
            if not self.node:
                raise StopIteration
            temp = self.node
            self.node = self.node.next
            return temp


class SinglyListNode(ListNode):
    def __init__(self, value: int = 0, next2: Optional['SinglyListNode'] = None):
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


SINGLY_LIST_NODE_MAX: SinglyListNode = SinglyListNode(maxsize)
SINGLY_LIST_NODE_ZERO: SinglyListNode = SinglyListNode(0)
