from unittest import main

from src.problems1_100.length_of_last_word import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestLengthOfLastWord(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.length_of_last_word(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
