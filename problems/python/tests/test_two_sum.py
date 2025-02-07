import unittest
from typing import override

from problems.python.src.two_sum import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestTwoSum(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'two_sum.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.two_sum(sample['input']['nums'], sample['input']['target']),
                    sample['explanation'],
                )
                self.assertEqual(
                    sample['output'],
                    solution.two_sum(sample['input']['nums'], sample['input']['target']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
