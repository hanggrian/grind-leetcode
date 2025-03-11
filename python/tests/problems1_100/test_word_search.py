from unittest import main

from src.problems1_100.word_search import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestWordSearch(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.exist(sample['input']['board'], sample['input']['word']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
