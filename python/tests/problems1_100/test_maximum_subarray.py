from unittest import main

from src.problems1_100.maximum_subarray import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMaximumSubarray(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.max_sub_array(sample['input']['nums']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
