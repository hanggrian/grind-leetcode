from unittest import main

from src.problems201_300.valid_anagram import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestValidAnagram(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_anagram(sample['input']['s'], sample['input']['t']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
