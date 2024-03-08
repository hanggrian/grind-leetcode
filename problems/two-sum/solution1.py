class BruteForce:
    @staticmethod
    def two_sum(nums: list[int], target: int) -> list[int] | None:
        for i, num in enumerate(nums):
            complement = target - num
            if complement in nums[i + 1:]:
                return [i, nums.index(complement, i + 1)]
        return None


class SinglePass:
    @staticmethod
    def two_sum(nums: list[int], target: int) -> list[int] | None:
        # remaining to index mapping
        seen = {}

        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
        return [-1, -1]
