import unittest
from typing import override

from src.concepts.list_nodes import SinglyListNode
from src.problems1.merge_k_sorted_lists import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestMergeKSortedLists(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'merge_k_sorted_lists.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.merge_k_lists(
                        [SinglyListNode.of(*lst) for lst in sample['input']['lists']],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
