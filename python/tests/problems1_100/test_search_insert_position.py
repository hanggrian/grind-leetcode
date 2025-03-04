import unittest
from unittest import TestCase

from src.problems1_100.search_insert_position import SOLUTIONS
from tests.sample.samples import get_samples


class TestSearchInsertPosition(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
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
