import unittest
from unittest import TestCase

from src.problems1_100.longest_palindromic_substring import SOLUTIONS
from tests.sample.samples import get_samples


class TestLongestPalindromicSubstring(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.longest_palindrome(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
