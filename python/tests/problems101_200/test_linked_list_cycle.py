from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems101_200.linked_list_cycle import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestLinkedListCycle(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                inp = SinglyListNode.of(*sample['input']['head'])
                if sample['input']['pos'] > -1:
                    inp.iterate_last().next = inp.iterate_to(sample['input']['pos'])
                self.assertEqual(
                    sample['output'],
                    solution.has_cycle(inp),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
