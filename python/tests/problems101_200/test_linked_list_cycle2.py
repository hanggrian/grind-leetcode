from typing import override
from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems101_200.linked_list_cycle2 import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestLinkedListCycle(SampledTest):
    @override
    def get_sample_filename(self):
        return 'linked-list-cycle-ii.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                inp = SinglyListNode.of(*sample['input']['head'])
                out = None
                if sample['input']['pos'] > -1:
                    out = inp.iterate_to(sample['input']['pos'])
                    inp.iterate_last().next = out
                self.assertEqual(
                    out,
                    solution.detect_cycle(inp),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
