import unittest
from unittest import TestCase

from src.problems1_100.longest_substring_without_repeating_characters import SOLUTIONS
from tests.sample.samples import get_samples


class TestLongestSubstringWithoutRepeatingCharacters(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.length_of_longest_substring(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
