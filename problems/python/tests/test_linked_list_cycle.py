import unittest
from typing import override

from concepts.python.src.list_nodes import SinglyListNode
from problems.python.src.linked_list_cycle import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestLinkedListCycle(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'linked_list_cycle.json'

    def test(self):
        for sample in self.get_samples():
            node = SinglyListNode.of(*sample['input']['head'])
            if sample['input']['pos'] > -1:
                node.iterate_last().next = node.iterate_to(sample['input']['pos'])
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.has_cycle(node),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
