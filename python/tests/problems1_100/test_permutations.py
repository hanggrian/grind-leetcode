from unittest import main

from src.problems1_100.permutations import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestPermutations(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.permute(sample['input']['nums']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
