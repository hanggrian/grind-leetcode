import unittest
from typing import override

from problems.python.src.container_with_most_water import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestContainerWithMostWater(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'container_with_most_water.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.max_area(sample['input']['height']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
