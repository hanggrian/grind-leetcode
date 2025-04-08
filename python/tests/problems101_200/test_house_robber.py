from unittest import main

from src.problems101_200.house_robber import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestHouseRobber(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.rob(sample['input']['nums']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
