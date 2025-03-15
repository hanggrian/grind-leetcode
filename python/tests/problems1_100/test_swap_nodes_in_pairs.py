from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems1_100.swap_nodes_in_pairs import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSwapNodesInPairs(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.swap_pairs(SinglyListNode.of(*sample['input']['head'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
