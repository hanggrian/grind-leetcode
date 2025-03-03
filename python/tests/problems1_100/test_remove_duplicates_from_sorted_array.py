import unittest
from unittest import TestCase

from src.problems1_100.remove_duplicates_from_sorted_array import SOLUTIONS
from tests.sample.samples import get_samples


class TestRemoveDuplicatesFromSortedArray(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.remove_duplicates(sample['input']['nums']),
                    sample['explanation'],
                )

                sub_list = sample['input']['nums'][0:sample['output']]
                self.assertTrue(len(set(sub_list)) == len(sub_list))


if __name__ == '__main__':
    unittest.main()
