import unittest
from typing import override

from src.problems1.three_sum import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestThreeSum(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'three_sum.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.three_sum(sample['input']['nums']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
