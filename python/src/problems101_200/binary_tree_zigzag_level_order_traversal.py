from abc import ABC, abstractmethod
from collections import deque
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def zigzag_level_order(self, root: TreeNode | None) -> list[list[int]]:
        pass


class Default(Problem):
    @override
    def zigzag_level_order(self, root: TreeNode | None) -> list[list[int]]:
        lists = []
        if not root:
            return lists

        queue = deque([root])
        while len(queue) > 0:
            size = len(queue)
            level = []
            for i in range(size):
                node = queue.popleft()
                level.append(node.value)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            lists.append(level)

        for i, l in enumerate(lists):
            if i % 2 == 1:
                l.reverse()
        return lists


SOLUTIONS: list[Problem] = [Default()]
