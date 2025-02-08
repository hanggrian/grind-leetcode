import unittest
from typing import override

from problems.python.src.longest_substring_without_repeating_characters import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestLongestSubstringWithoutRepeatingCharacters(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'longest_substring_without_repeating_characters.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.length_of_longest_substring(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
