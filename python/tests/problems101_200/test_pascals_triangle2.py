from typing import override
from unittest import main

from src.problems101_200.pascals_triangle2 import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestPascalsTriangle2(SampledTest):
    @override
    def get_sample_filename(self):
        return 'pascals-triangle-ii.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.get_row(sample['input']['rowIndex']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
