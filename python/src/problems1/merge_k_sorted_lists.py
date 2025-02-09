from abc import ABC, abstractmethod
from typing import override

from src.concepts.list_nodes import SinglyListNode, SINGLY_LIST_NODE_MAX


class Problem(ABC):
    @abstractmethod
    def merge_k_lists(self, lists: list[SinglyListNode]) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def merge_k_lists(self, lists: list[SinglyListNode]) -> SinglyListNode | None:
        nodes = [n for n in lists if n is not None]
        if len(nodes) == 0:
            return None

        root = SinglyListNode()
        current = root
        while len(nodes) > 0:
            # find lowest
            lowest = min(nodes, key=lambda n: n.value, default=SINGLY_LIST_NODE_MAX)

            # append lowest to current
            current.next = SinglyListNode(lowest.value)
            current = current.next

            # remove the lowest node within list
            if not lowest.next:
                nodes.remove(lowest)
                continue
            nxt = lowest.next
            lowest.value = nxt.value
            lowest.next = nxt.next
        return root.next


SOLUTIONS: list[Problem] = [Default()]
