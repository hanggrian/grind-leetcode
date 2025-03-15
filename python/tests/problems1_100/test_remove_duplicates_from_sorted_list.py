from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems1_100.remove_duplicates_from_sorted_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRemoveDuplicatesFromSortedList(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.delete_duplicates(SinglyListNode.of(*sample['input']['head'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
