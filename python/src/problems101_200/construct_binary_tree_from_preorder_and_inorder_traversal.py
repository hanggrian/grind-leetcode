from abc import ABC, abstractmethod
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def build_tree(self, preorder: list[int], inorder: list[int]) -> TreeNode | None:
        pass


class Default(Problem):
    @override
    def build_tree(self, preorder: list[int], inorder: list[int]) -> TreeNode | None:
        if len(preorder) == 0 or len(inorder) == 0:
            return None

        root: TreeNode = TreeNode(preorder[0])
        mid: int = -1
        for i, order in enumerate(inorder):
            if order != preorder[0]:
                continue
            mid = i
            break
        root.left = \
            self.build_tree(
                preorder[1:mid + 1],
                inorder[:mid],
            )
        root.right = \
            self.build_tree(
                preorder[mid + 1:],
                inorder[mid + 1:],
            )
        return root


SOLUTIONS: list[Problem] = [Default()]
