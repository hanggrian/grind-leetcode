import unittest
from typing import override

from src.concepts.list_nodes import SinglyListNode
from src.problems1.remove_nth_node_from_end_of_list import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestRemoveNthNodeFromEndOfList(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'remove_nth_node_from_end_of_list.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.remove_nth_from_end(
                        SinglyListNode.of(*sample['input']['head']),
                        sample['input']['n'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
