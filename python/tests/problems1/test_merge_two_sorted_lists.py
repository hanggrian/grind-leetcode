import unittest
from typing import override

from src.concepts.list_nodes import SinglyListNode
from src.problems1.merge_two_sorted_lists import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestMergeTwoSortedLists(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'merge_two_sorted_lists.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.merge_two_lists(
                        SinglyListNode.of(*sample['input']['list1']),
                        SinglyListNode.of(*sample['input']['list2']),
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
