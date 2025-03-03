import unittest
from unittest import TestCase

from src.concepts.list_nodes import SinglyListNode
from src.problems1_100.swap_nodes_in_pairs import SOLUTIONS
from tests.sample.samples import get_samples


class TestSwapNodesInPairs(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.swap_pairs(SinglyListNode.of(*sample['input']['head'])),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
