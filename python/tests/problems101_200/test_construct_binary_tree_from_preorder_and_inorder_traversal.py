from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems101_200.construct_binary_tree_from_preorder_and_inorder_traversal import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestConstructBinaryTreeFromPreorderAndInorderTraversal(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    TreeNode.of(*sample['output']),
                    solution.build_tree(
                        sample['input']['preorder'],
                        sample['input']['inorder'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
