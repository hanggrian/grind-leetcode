from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems201_300.delete_node_in_a_linked_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestDeleteNodeInALinkedList(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                head = SinglyListNode.of(*sample['input']['head'])
                if sample['input']['node'] > -1:
                    solution.delete_node(
                        next(filter(lambda n: n.val == sample['input']['node'], head)),
                    )
                self.assertEqual(SinglyListNode.of(*sample['output']), head, sample['message'])


if __name__ == '__main__':
    main()
