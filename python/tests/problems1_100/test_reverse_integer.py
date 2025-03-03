import unittest
from unittest import TestCase

from src.problems1_100.reverse_integer import SOLUTIONS
from tests.sample.samples import get_samples


class TestReverseInteger(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.reverse(sample['input']['x']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
