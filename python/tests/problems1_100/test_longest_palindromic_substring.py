import unittest

from src.problems1_100.longest_palindromic_substring import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestLongestPalindromicSubstring(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.longest_palindrome(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
