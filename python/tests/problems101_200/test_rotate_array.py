from unittest import main

from src.problems101_200.rotate_array import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRotateArray(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                nums: list[int] = sample['input']['nums']
                solution.rotate(nums, sample['input']['k'])
                self.assertEqual(sample['output'], nums, sample['message'])


if __name__ == '__main__':
    main()
