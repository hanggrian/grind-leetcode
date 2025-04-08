from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems201_300.binary_tree_paths import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestBinaryTreePaths(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.binary_tree_paths(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
