from unittest import main

from src.problems1_100.valid_sudoku import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestValidSudoku(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_valid_sudoku(sample['input']['board']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
