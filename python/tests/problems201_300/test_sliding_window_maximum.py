from unittest import main

from src.problems201_300.sliding_window_maximum import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSlidingWindowMaximum(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.max_sliding_window(sample['input']['nums'], sample['input']['k']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
