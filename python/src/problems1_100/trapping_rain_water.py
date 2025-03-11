from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def trap(self, height: list[int]) -> int:
        pass


class Default(Problem):
    @override
    def trap(self, height: list[int]) -> int:
        if len(height) < 3:
            return 0

        # create two arrays of increasing height for each end
        ltr_height = [0] * len(height)
        rtl_height = [0] * len(height)
        ltr_height[0] = height[0]
        rtl_height[len(height) - 1] = height[len(height) - 1]
        for i in range(1, len(height)):
            ltr_height[i] = max(ltr_height[i - 1], height[i])
        for i in range(len(height) - 2, -1, -1):
            rtl_height[i] = max(rtl_height[i + 1], height[i])

        # the overlap between two heights is the water
        water = 0
        for i, h in enumerate(height):
            water += min(ltr_height[i], rtl_height[i]) - h
        return water


SOLUTIONS: list[Problem] = [Default()]
