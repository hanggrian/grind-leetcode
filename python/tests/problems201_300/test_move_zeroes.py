from unittest import main

from src.problems201_300.move_zeroes import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMoveZeroes(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                nums = sample['input']['nums']
                solution.move_zeroes(nums)
                self.assertEqual(sample['output'], nums, sample['message'])


if __name__ == '__main__':
    main()
