from unittest import main

from src.problems101_200.word_break import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestWordBreak(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.word_break(sample['input']['s'], sample['input']['wordDict']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
