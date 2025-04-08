from abc import ABC, abstractmethod
from collections import deque
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def level_order(self, root: TreeNode | None) -> list[list[int]]:
        pass


class Default(Problem):
    @override
    def level_order(self, root: TreeNode | None) -> list[list[int]]:
        lists: list[list[int]] = []
        if not root:
            return lists

        queue: deque[TreeNode] = deque([root])
        while len(queue) > 0:
            size: int = len(queue)
            level: list[int] = []
            for _ in range(size):
                current = queue.popleft()
                level.append(current.val)
                if current.left:
                    queue.append(current.left)
                if current.right:
                    queue.append(current.right)
            lists.append(level)
        return lists


SOLUTIONS: list[Problem] = [Default()]
