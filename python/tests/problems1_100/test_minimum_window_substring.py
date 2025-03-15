from unittest import main

from src.problems1_100.minimum_window_substring import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMinimumWindowSubstring(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.min_window(sample['input']['s'], sample['input']['t']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
