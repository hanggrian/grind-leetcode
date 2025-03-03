import unittest
from unittest import TestCase

from src.problems1_100.valid_sudoku import SOLUTIONS
from tests.sample.samples import get_samples


class TestValidSudoku(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_valid_sudoku(sample['input']['board']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
