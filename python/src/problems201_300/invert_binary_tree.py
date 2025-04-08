from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def invert_tree(self, root: TreeNode | None) -> TreeNode | None:
        pass


class Default(Problem):
    @override
    def invert_tree(self, root: TreeNode | None) -> TreeNode | None:
        if not root:
            return None
        temp: TreeNode | None = root.left
        root.left = self.invert_tree(root.right)
        root.right = self.invert_tree(temp)
        return root


SOLUTIONS: list[Problem] = [Default()]
