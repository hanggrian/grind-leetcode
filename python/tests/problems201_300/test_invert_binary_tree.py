from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems201_300.invert_binary_tree import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestInvertBinaryTree(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    TreeNode.of(*sample['output']),
                    solution.invert_tree(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
