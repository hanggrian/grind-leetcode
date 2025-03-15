from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems1_100.validate_binary_search_tree import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestValidateBinarySearchTree(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_valid_bst(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
