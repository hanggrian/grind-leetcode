import unittest
from typing import override

from src.concepts.list_nodes import SinglyListNode
from src.problems101.linked_list_cycle import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestLinkedListCycle(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'linked_list_cycle.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                inp = SinglyListNode.of(*sample['input']['head'])
                if sample['input']['pos'] > -1:
                    inp.iterate_last().next = inp.iterate_to(sample['input']['pos'])
                self.assertEqual(
                    sample['output'],
                    solution.has_cycle(inp),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
