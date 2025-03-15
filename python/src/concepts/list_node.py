from collections.abc import Iterable, Iterator

from .node import Node


class ListNode(Node, Iterable):
    def __init__(self, value: int):
        super().__init__(value)
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
