from unittest import main

from src.problems1_100.merge_intervals import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMergeIntervals(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.merge(sample['input']['intervals']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
