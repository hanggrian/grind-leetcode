import unittest
from unittest import TestCase

from src.problems1_100.string_to_integer_atoi import SOLUTIONS
from tests.sample.samples import get_samples


class TestStringToIntegerAtoi(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.my_atoi(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
