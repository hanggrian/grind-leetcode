import unittest
from unittest import TestCase

from src.problems1_100.zigzag_conversion import SOLUTIONS
from tests.sample.samples import get_samples


class TestZigzagConversion(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.convert(
                        sample['input']['s'],
                        sample['input']['numRows'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
