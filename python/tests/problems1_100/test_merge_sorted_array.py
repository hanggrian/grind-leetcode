from unittest import main

from src.problems1_100.merge_sorted_array import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMergeSortedArray(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                nums1 = sample['input']['nums1']
                nums2 = sample['input']['nums2']
                solution.merge(nums1, sample['input']['m'], nums2, sample['input']['n'])
                self.assertEqual(
                    sample['output'],
                    nums1,
                    sample['message'],
                )


if __name__ == '__main__':
    main()
