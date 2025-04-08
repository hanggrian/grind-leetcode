from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems101_200.binary_tree_right_side_view import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestBinaryTreeRightSideView(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.right_side_view(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
