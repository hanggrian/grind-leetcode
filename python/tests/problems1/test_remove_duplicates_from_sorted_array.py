import unittest
from typing import override

from src.problems1.remove_duplicates_from_sorted_array import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestRemoveDuplicatesFromSortedArray(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'remove_duplicates_from_sorted_array.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.remove_duplicates(sample['input']['nums']),
                    sample['explanation'],
                )

                sub_list = sample['input']['nums'][0:sample['output']]
                self.assertTrue(len(set(sub_list)) == len(sub_list))


if __name__ == '__main__':
    unittest.main()
