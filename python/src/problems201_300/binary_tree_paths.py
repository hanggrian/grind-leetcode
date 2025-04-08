from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def binary_tree_paths(self, root: TreeNode | None) -> list[str]:
        pass


class Default(Problem):
    @override
    def binary_tree_paths(self, root: TreeNode | None) -> list[str]:
        paths: list[str] = []
        self.dfs(root, paths, '')
        return paths

    def dfs(self, node: TreeNode | None, paths: list[str], path: str) -> None:
        if not node:
            return
        if not node.left and not node.right:
            paths.append(f'{path}{node.val}')
        if node.left:
            self.dfs(node.left, paths, f'{path}{node.val}->')
        if node.right:
            self.dfs(node.right, paths, f'{path}{node.val}->')


SOLUTIONS: list[Problem] = [Default()]
