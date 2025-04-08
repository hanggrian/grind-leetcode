from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def is_valid_bst(self, root: TreeNode | None) -> bool:
        pass


class Default(Problem):
    @override
    def is_valid_bst(self, root: TreeNode | None) -> bool:
        return self.recursive_valid(root, None, None)

    def recursive_valid(self, node: TreeNode | None, left: int | None, right: int | None) -> bool:
        if not node:
            return True
        if left and node.val <= left:
            return False
        if right and node.val >= right:
            return False
        return self.recursive_valid(node.left, left, node.val) and \
            self.recursive_valid(node.right, node.val, right)


SOLUTIONS: list[Problem] = [Default()]
