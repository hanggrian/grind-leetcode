import unittest
from unittest import TestCase

from src.problems1_100.palindrome_number import SOLUTIONS
from tests.sample.samples import get_samples


class TestPalindromeNumber(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_palindrome(sample['input']['x']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
