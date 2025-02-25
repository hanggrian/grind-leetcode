import unittest

from src.problems1_100.container_with_most_water import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestContainerWithMostWater(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.max_area(sample['input']['height']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
