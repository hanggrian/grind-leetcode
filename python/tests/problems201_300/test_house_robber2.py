from typing import override
from unittest import main

from src.problems201_300.house_robber2 import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestHouseRobber2(SampledTest):
    @override
    def get_sample_filename(self):
        return 'house-robber-ii.json'

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
