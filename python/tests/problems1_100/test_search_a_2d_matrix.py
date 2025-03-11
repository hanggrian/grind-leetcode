from typing import override
from unittest import main

from src.problems1_100.search_a_2d_matrix import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSearchA2dMatrix(SampledTest):
    @override
    def get_sample_filename(self):
        return 'search-a-2d-matrix.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.search_matrix(
                        sample['input']['matrix'],
                        sample['input']['target'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
