from unittest import main

from src.problems1_100.longest_substring_without_repeating_characters import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestLongestSubstringWithoutRepeatingCharacters(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.length_of_longest_substring(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
