from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def is_same_tree(self, p: TreeNode | None, q: TreeNode | None) -> bool:
        pass


class Default(Problem):
    @override
    def is_same_tree(self, p: TreeNode | None, q: TreeNode | None) -> bool:
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return False
        return self.is_same_tree(p.left, q.left) and \
            self.is_same_tree(p.right, q.right)


SOLUTIONS: list[Problem] = [Default()]
