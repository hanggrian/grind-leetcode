import unittest
from typing import override

from src.problems1.container_with_most_water import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestContainerWithMostWater(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'container_with_most_water.json'

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
