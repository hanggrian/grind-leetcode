from unittest import main

from src.problems101_200.pascals_triangle import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestPascalsTriangle(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.generate(sample['input']['numRows']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
