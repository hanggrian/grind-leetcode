import unittest
from unittest import TestCase

from src.problems1_100.container_with_most_water import SOLUTIONS
from tests.sample.samples import get_samples


class TestContainerWithMostWater(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.max_area(sample['input']['height']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
