import unittest
from unittest import TestCase

from src.problems1_100.median_of_two_sorted_arrays import SOLUTIONS
from tests.sample.samples import get_samples


class TestMedianOfTwoSortedArrays(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.find_median_sorted_arrays(
                        sample['input']['nums1'],
                        sample['input']['nums2'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
