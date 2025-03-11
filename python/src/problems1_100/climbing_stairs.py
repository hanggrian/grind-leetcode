from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def climb_stairs(self, n: int) -> int:
        pass


class DynamicProgramming(Problem):
    @override
    def climb_stairs(self, n: int) -> int:
        if n in {0, 1}:
            return 1
        return self.climb_stairs(n - 1) + self.climb_stairs(n - 2)


class BruteForce(Problem):
    @override
    def climb_stairs(self, n: int) -> int:
        if n <= 2:
            return n
        results = [0] * n
        results[0] = 1
        results[1] = 2
        for i in range(2, n):
            results[i] = results[i - 1] + results[i - 2]
        return results[n - 1]


SOLUTIONS: list[Problem] = [BruteForce(), BruteForce()]
