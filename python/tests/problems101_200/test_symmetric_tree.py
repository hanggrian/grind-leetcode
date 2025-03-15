from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems101_200.symmetric_tree import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSymmetricTree(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_symmetric(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
