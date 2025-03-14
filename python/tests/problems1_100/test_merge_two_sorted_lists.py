from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems1_100.merge_two_sorted_lists import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMergeTwoSortedLists(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.merge_two_lists(
                        SinglyListNode.of(*sample['input']['list1']),
                        SinglyListNode.of(*sample['input']['list2']),
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
