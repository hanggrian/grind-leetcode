from unittest import main

from src.problems101_200.number_of_islands import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestNumberOfIslands(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.num_islands(sample['input']['grid']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
