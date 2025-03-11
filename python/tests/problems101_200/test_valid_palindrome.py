from unittest import main

from src.problems101_200.valid_palindrome import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestValidPalindrome(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_palindrome(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
