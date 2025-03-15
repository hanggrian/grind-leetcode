from typing import override
from unittest import main

from src.problems101_200.word_break2 import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestWordBreak2(SampledTest):
    @override
    def get_sample_filename(self):
        return 'word-break-ii.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                for output in sample['output']:
                    self.assertIn(
                        output,
                        solution.word_break(sample['input']['s'], sample['input']['wordDict']),
                        sample['message'],
                    )


if __name__ == '__main__':
    main()
