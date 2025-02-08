from abc import ABC, abstractmethod
from typing import override


class Problem(ABC):
    @abstractmethod
    def three_sum(self, nums: list[int]) -> list[list[int]]:
        pass


class Default(Problem):
    @override
    def three_sum(self, nums: list[int]) -> list[list[int]]:
        results = []
        if len(nums) < 3:
            return results
        nums.sort()
        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue  # skip same result
            j = i + 1
            k = len(nums) - 1
            while j < k:
                three_sum = nums[i] + nums[j] + nums[k]
                if three_sum == 0:
                    results.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    while j < k and nums[j] == nums[j + 1]:
                        j += 1  # skip same result
                    while j < k and nums[k] == nums[k - 1]:
                        k -= 1  # skip same result
                elif three_sum < 0:
                    j += 1
                else:
                    k -= 1
        return results


SOLUTIONS: list[Problem] = [Default()]
