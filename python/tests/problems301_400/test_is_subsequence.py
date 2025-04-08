from unittest import main

from src.problems301_400.is_subsequence import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestIsSubsequence(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_subsequence(sample['input']['s'], sample['input']['t']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
