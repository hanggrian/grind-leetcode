from unittest import main

from src.concepts.list_nodes import SinglyListNode
from src.problems1_100.remove_nth_node_from_end_of_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRemoveNthNodeFromEndOfList(SampledTest):
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
    main()
