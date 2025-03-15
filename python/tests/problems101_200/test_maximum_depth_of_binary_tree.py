from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems101_200.maximum_depth_of_binary_tree import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestMaximumDepthOfBinaryTree(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.max_depth(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
