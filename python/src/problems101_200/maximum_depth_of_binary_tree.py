from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def max_depth(self, root: TreeNode | None) -> int:
        pass


class Default(Problem):
    @override
    def max_depth(self, root: TreeNode | None) -> int:
        return self.recursive_max_depth(root, 0)

    def recursive_max_depth(self, node: TreeNode | None, depth: int) -> int:
        if not node:
            return depth
        left_depth: int = self.recursive_max_depth(node.left, depth + 1)
        right_depth: int = self.recursive_max_depth(node.right, depth + 1)
        return max(left_depth, right_depth)


SOLUTIONS: list[Problem] = [Default()]
