from typing import override
from unittest import main

from src.concepts.list_nodes import SinglyListNode
from src.problems1_100.reverse_linked_list2 import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestReverseLinkedList2(SampledTest):
    @override
    def get_sample_filename(self):
        return 'reverse-linked-list-ii.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.reverse_between(
                        SinglyListNode.of(*sample['input']['head']),
                        sample['input']['left'],
                        sample['input']['right'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
