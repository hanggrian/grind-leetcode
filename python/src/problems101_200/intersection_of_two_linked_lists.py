from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode


class Problem(ABC):
    @abstractmethod
    def get_intersection_node(
        self,
        head_a: SinglyListNode | None,
        head_b: SinglyListNode | None,
    ) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def get_intersection_node(
        self,
        head_a: SinglyListNode | None,
        head_b: SinglyListNode | None,
    ) -> SinglyListNode | None:
        node_a: SinglyListNode | None = head_a
        node_b: SinglyListNode | None = head_b
        while node_a != node_b:
            node_a = node_a.next if node_a else head_b
            node_b = node_b.next if node_b else head_a
        return node_a


SOLUTIONS: list[Problem] = [Default()]
