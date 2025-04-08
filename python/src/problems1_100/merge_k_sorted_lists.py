from abc import ABC, abstractmethod
from typing import override

from src.concepts.singly_list_node import SinglyListNode, SINGLY_LIST_NODE_MAX


class Problem(ABC):
    @abstractmethod
    def merge_k_lists(self, lists: list[SinglyListNode]) -> SinglyListNode | None:
        pass


class Default(Problem):
    @override
    def merge_k_lists(self, lists: list[SinglyListNode]) -> SinglyListNode | None:
        nodes: list[SinglyListNode] = [n for n in lists if n]
        if len(nodes) == 0:
            return None

        root: SinglyListNode = SinglyListNode()
        current: SinglyListNode = root
        while len(nodes) > 0:
            # find lowest
            lowest: SinglyListNode = min(nodes, key=lambda n: n.val, default=SINGLY_LIST_NODE_MAX)

            # append lowest to current
            current.next = SinglyListNode(lowest.val)
            current = current.next

            # remove the lowest node within list
            if not lowest.next:
                nodes.remove(lowest)
                continue
            nxt: SinglyListNode = lowest.next
            lowest.val = nxt.val
            lowest.next = nxt.next
        return root.next


SOLUTIONS: list[Problem] = [Default()]
