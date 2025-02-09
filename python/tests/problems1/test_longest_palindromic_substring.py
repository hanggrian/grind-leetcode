import unittest
from typing import override

from src.problems1.longest_palindromic_substring import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestLongestPalindromicSubstring(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'longest_palindromic_substring.json'

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
