import unittest
from unittest import TestCase

from src.problems1_100.roman_to_integer import SOLUTIONS
from tests.sample.samples import get_samples


class TestRomanToInteger(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.roman_to_int(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
