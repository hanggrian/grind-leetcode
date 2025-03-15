from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems101_200.binary_tree_level_order_traversal import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestBinaryTreeLevelOrderTraversal(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.level_order(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
