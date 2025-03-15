from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def is_symmetric(self, root: TreeNode | None) -> bool:
        pass


class Default(Problem):
    @override
    def is_symmetric(self, root: TreeNode | None) -> bool:
        return not root or \
            self.recursive_is_symmetric(root.left, root.right)

    def recursive_is_symmetric(self, node1: TreeNode | None, node2: TreeNode | None) -> bool:
        if not node1 and not node2:
            return True
        if not node1 or not node2:
            return False
        return node1.value == node2.value and \
            self.recursive_is_symmetric(node1.left, node2.right) and \
            self.recursive_is_symmetric(node1.right, node2.left)


SOLUTIONS: list[Problem] = [Default()]
