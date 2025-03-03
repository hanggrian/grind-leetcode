import unittest
from unittest import TestCase

from src.problems1_100.three_sum import SOLUTIONS
from tests.sample.samples import get_samples


class TestThreeSum(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.three_sum(sample['input']['nums']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
