import unittest
from typing import override

from src.problems1.search_insert_position import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestSearchInsertPosition(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'search_insert_position.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.search_insert(
                        sample['input']['nums'],
                        sample['input']['target'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
