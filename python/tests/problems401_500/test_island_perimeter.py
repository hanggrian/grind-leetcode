from unittest import main

from src.problems401_500.island_perimeter import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestIslandPerimeter(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.island_perimeter(sample['input']['grid']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
