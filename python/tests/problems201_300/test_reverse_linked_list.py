from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems201_300.reverse_linked_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestReverseLinkedList(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.reverse_list(SinglyListNode.of(*sample['input']['head'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
