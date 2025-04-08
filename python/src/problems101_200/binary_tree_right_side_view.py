from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def right_side_view(self, root: TreeNode | None) -> list[int]:
        pass


class Default(Problem):
    @override
    def right_side_view(self, root: TreeNode | None) -> list[int]:
        result: list[int] = []
        self.dfs(root, result, 0)
        return result

    def dfs(self, node: TreeNode | None, l: list[int], level: int) -> None:
        if not node:
            return
        if level == len(l):
            l.append(node.val)
        self.dfs(node.right, l, level + 1)
        self.dfs(node.left, l, level + 1)


SOLUTIONS: list[Problem] = [Default()]
