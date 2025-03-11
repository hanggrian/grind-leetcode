from unittest import main

from src.problems1_100.palindrome_number import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestPalindromeNumber(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_palindrome(sample['input']['x']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
