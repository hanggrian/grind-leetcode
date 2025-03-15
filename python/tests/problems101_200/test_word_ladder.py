from unittest import main

from src.problems101_200.word_ladder import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestWordLadder(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.ladder_length(
                        sample['input']['beginWord'],
                        sample['input']['endWord'],
                        sample['input']['wordList'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
