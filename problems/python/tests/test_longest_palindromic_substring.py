import unittest
from typing import override

from problems.python.src.longest_palindromic_substring import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestLongestPalindromicSubstring(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'longest_palindromic_substring.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.longest_palindrome(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
