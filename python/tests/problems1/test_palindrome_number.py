import unittest
from typing import override

from src.problems1.palindrome_number import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestPalindromeNumber(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'palindrome_number.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_palindrome(sample['input']['x']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
