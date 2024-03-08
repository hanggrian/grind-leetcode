from typing import Optional


class ListNode:
    def __init__(self, value: int = 0, next2: Optional['ListNode'] = None):
        self.value = value
        self.next = next2

    def iterate_to(self, position: int) -> "ListNode":
        node: ListNode = self
        for _ in range(position):
            node = node.next
        return node

    def iterate_last(self) -> "ListNode":
        node: ListNode = self
        while node.next:
            node = node.next
        return node

    def has_next(self) -> bool:
        return not self.next

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


class SinglyListNode(ListNode):
    def __init__(self, value: int = 0, next2: Optional["SinglyListNode"] = None):
        super().__init__(value, next2)

    @staticmethod
    def of(*values: int) -> "SinglyListNode":
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
        next2: Optional["DoublyListNode"] = None,
        prev: Optional["DoublyListNode"] = None,
    ):
        super().__init__(value, next2)
        self.previous = prev
