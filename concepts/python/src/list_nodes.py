from collections.abc import Iterable, Iterator
from typing import Optional, TypeVar, Generic

T = TypeVar('T', bound='ListNode')


class ListNode(Generic[T], Iterable):
    def __init__(self, value: int):
        self.value: int = value
        self.next: T | None = None

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

    def __iter__(self):
        return self.ListNodeIterator(self)

    def __hash__(self):
        return hash(self.value)

    def __eq__(self, other):
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
        return node1 == node2

    class ListNodeIterator(Iterator['ListNode']):
        def __init__(self, node: 'ListNode'):
            self.node = node

        def __next__(self):
            if not self.node:
                raise StopIteration
            temp = self.node
            self.node = self.node.next
            return temp


class SinglyListNode(ListNode):
    def __init__(self, value: int = 0, next2: Optional['SinglyListNode'] = None):
        super().__init__(value)
        self.next = next2

    @staticmethod
    def of(*values: int) -> 'SinglyListNode':
        if not values:
            raise ValueError("Can't be empty.")
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
        self.next = next2
        self.prev: DoublyListNode | None = prev2


SINGLY_LIST_NODE_ZERO: SinglyListNode = SinglyListNode(0)
