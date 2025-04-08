from collections import deque
from typing import Optional

from .node import Node


class TreeNode(Node):
    def __init__(
        self,
        val: int,
        left: Optional['TreeNode'] = None,
        right: Optional['TreeNode'] = None,
    ):
        super().__init__(val)
        self.left: TreeNode | None = left
        self.right: TreeNode | None = right

    def has_left(self) -> bool:
        return self.left is not None

    def has_right(self) -> bool:
        return self.right is not None

    def is_leaf(self) -> bool:
        return self.right is None and self.right is None

    def recursive_eq(self, node1: Optional['TreeNode'], node2: Optional['TreeNode']) -> bool:
        if not node1 and not node2:
            return True
        if not node1 or not node2:
            return False
        return node1.val == node2.val and \
            self.recursive_eq(node1.left, node2.left) and \
            self.recursive_eq(node1.right, node2.right)

    def __eq__(self, other: object) -> bool:
        if self is other:
            return True
        if not isinstance(other, TreeNode):
            return False
        return self.recursive_eq(self, other)

    def __hash__(self) -> int:
        return hash(self.val)

    @staticmethod
    def of(*vals: int | None) -> Optional['TreeNode']:
        if len(vals) == 0:
            return None
        root = TreeNode(vals[0])
        queue = deque([root])
        i = 1
        while queue:
            node = queue.popleft()
            if i < len(vals) and vals[i]:
                node.left = TreeNode(vals[i])
                queue.append(node.left)
            i += 1
            if i < len(vals) and vals[i]:
                node.right = TreeNode(vals[i])
                queue.append(node.right)
            i += 1
        return root
