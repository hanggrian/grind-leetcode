from unittest import main

from src.problems1_100.three_sum import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestThreeSum(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.three_sum(sample['input']['nums']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
