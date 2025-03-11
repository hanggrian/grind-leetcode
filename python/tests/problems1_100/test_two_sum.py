from unittest import main

from src.problems1_100.two_sum import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestTwoSum(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.two_sum(
                        sample['input']['nums'],
                        sample['input']['target'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
