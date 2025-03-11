from unittest import main

from src.problems101_200.triangle import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestTriangle(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.minimum_total(sample['input']['triangle']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
