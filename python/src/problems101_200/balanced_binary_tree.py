from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def is_balanced(self, root: TreeNode | None) -> bool:
        pass


class Default(Problem):
    @override
    def is_balanced(self, root: TreeNode | None) -> bool:
        if not root:
            return True
        if abs(self.max_depth(root.left, 1) - self.max_depth(root.right, 1)) > 1:
            return False
        return self.is_balanced(root.left) and self.is_balanced(root.right)

    def max_depth(self, node: TreeNode | None, depth: int) -> int:
        if not node:
            return depth
        left_depth = self.max_depth(node.left, depth + 1)
        right_depth = self.max_depth(node.right, depth + 1)
        return max(left_depth, right_depth)


SOLUTIONS: list[Problem] = [Default()]
