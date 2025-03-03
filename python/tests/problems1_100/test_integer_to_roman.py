import unittest
from unittest import TestCase

from src.problems1_100.integer_to_roman import SOLUTIONS
from tests.sample.samples import get_samples


class TestIntegerToRoman(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.int_to_roman(sample['input']['num']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
