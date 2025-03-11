from unittest import main

from src.problems1_100.sort_colors import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSortColors(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                nums = sample['input']['nums']
                solution.sort_colors(nums)
                self.assertEqual(
                    sample['output'],
                    nums,
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
