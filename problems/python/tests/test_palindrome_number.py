import unittest
from typing import override

from problems.python.src.palindrome_number import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestPalindromeNumber(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'palindrome_number.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.is_palindrome(sample['input']['x']),
                    sample['explanation'],
                )
                self.assertEqual(
                    sample['output'],
                    solution.is_palindrome(sample['input']['x']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
