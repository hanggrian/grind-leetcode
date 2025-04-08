from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def odd_even_list(self, head: SinglyListNode | None) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def odd_even_list(self, head: SinglyListNode | None) -> SinglyListNode | None:
        if head is None:
            return None

        odd: SinglyListNode = head
        even: SinglyListNode | None = head.next
        even_head: SinglyListNode = even

        while even and even.next:
            odd.next = even.next
            odd = odd.next
            even.next = odd.next
            even = even.next

        odd.next = even_head
        return head


SOLUTIONS: list[Problem] = [Default()]
