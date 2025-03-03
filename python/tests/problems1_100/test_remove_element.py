import unittest
from unittest import TestCase

from src.problems1_100.remove_element import SOLUTIONS
from tests.sample.samples import get_samples


class TestRemoveElement(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
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
