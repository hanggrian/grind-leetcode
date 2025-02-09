import unittest
from typing import override

from src.problems1.remove_element import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestRemoveElement(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'remove_element.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.remove_element(
                        sample['input']['nums'],
                        sample['input']['val'],
                    ),
                    sample['explanation'],
                )
                self.assertTrue(
                    sample['input']['val'] not in sample['input']['nums'][:sample['output']],
                )


if __name__ == '__main__':
    unittest.main()
