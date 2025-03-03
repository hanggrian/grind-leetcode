import unittest
from unittest import TestCase

from src.concepts.list_nodes import SinglyListNode
from src.problems1_100.merge_two_sorted_lists import SOLUTIONS
from tests.sample.samples import get_samples


class TestMergeTwoSortedLists(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
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
