import unittest
from typing import override

from problems.python.src.three_sum import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestThreeSum(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'three_sum.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.three_sum(sample['input']['nums']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
