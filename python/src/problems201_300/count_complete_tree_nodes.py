from abc import ABC, abstractmethod
from collections import deque
from typing import override

from src.concepts.tree_node import TreeNode


class Problem(ABC):
    @abstractmethod
    def count_nodes(self, root: TreeNode | None) -> int:
        pass


class Default(Problem):
    @override
    def count_nodes(self, root: TreeNode | None) -> int:
        if root is None:
            return 0
        count: int = 0
        queue: deque[TreeNode] = deque([root])
        while queue:
            node: TreeNode = queue.popleft()
            count += 1
            if node.left is not None:
                queue.append(node.left)
            if node.right is not None:
                queue.append(node.right)
        return count


SOLUTIONS: list[Problem] = [Default()]
