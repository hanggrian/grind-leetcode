from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems201_300.remove_linked_list_elements import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRemoveLinkedListElements(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.remove_elements(
                        SinglyListNode.of(*sample['input']['head']),
                        sample['input']['k'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
