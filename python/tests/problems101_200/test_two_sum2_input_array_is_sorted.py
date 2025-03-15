from typing import override
from unittest import main

from src.problems101_200.two_sum2_input_array_is_sorted import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestFindPeakElement(SampledTest):
    @override
    def get_sample_filename(self):
        return 'two-sum-ii-input-array-is-sorted.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.two_sum(sample['input']['numbers'], sample['input']['target']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
