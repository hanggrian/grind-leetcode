from abc import ABC, abstractmethod
from collections import deque
from typing import override


class Problem(ABC):
    @abstractmethod
    def max_sliding_window(self, nums: list[int], k: int) -> list[int]:
        pass


class Default(Problem):
    @override
    def max_sliding_window(self, nums: list[int], k: int) -> list[int]:
        queue: deque[int] = deque()
        maxes: list[int] = [0] * (len(nums) - k + 1)
        left: int = 0
        right: int = 0
        while right < len(nums):
            while queue and nums[queue[-1]] < nums[right]:
                queue.pop()
            queue.append(right)
            if left > queue[0]:
                queue.popleft()
            if right + 1 >= k:
                maxes[left] = nums[queue[0]]
                left += 1
            right += 1
        return maxes


SOLUTIONS: list[Problem] = [Default()]
