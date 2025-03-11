from unittest import main

from src.problems1_100.climbing_stairs import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestClimbingStairs(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.climb_stairs(sample['input']['n']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
