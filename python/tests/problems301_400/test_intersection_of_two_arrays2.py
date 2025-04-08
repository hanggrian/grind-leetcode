from typing import override
from unittest import main

from src.problems301_400.intersection_of_two_arrays2 import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestFirstUniqueCharacterInAString(SampledTest):
    @override
    def get_sample_filename(self):
        return 'intersection-of-two-arrays-ii.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.intersect(sample['input']['nums1'], sample['input']['nums2']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
