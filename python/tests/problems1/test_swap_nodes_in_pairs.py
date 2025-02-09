import unittest
from typing import override

from src.concepts.list_nodes import SinglyListNode
from src.problems1.swap_nodes_in_pairs import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestSwapNodesInPairs(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'swap_nodes_in_pairs.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.swap_pairs(SinglyListNode.of(*sample['input']['head'])),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
