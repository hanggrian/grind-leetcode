from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems201_300.lowest_common_ancestor_of_a_binary_search_tree import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestLowestCommonAncestorOfABinarySearchTree(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.lowest_common_ancestor(
                        TreeNode.of(*sample['input']['root']),
                        TreeNode(sample['input']['p']),
                        TreeNode(sample['input']['q']),
                    ).val,
                    sample['message'],
                )


if __name__ == '__main__':
    main()
