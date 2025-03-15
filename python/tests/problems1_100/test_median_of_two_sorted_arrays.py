from unittest import main

from src.problems1_100.median_of_two_sorted_arrays import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMedianOfTwoSortedArrays(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.find_median_sorted_arrays(
                        sample['input']['nums1'],
                        sample['input']['nums2'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
