from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def delete_node(self, node: SinglyListNode | None) -> None:
        pass


class Default(Problem):
    @override
    def delete_node(self, node: SinglyListNode | None) -> None:
        if not node:
            return
        nxt: SinglyListNode = node.next
        node.val = nxt.val
        node.next = nxt.next


SOLUTIONS: list[Problem] = [Default()]
