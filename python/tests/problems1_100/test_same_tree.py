from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems1_100.same_tree import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSameTree(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_same_tree(
                        TreeNode.of(*sample['input']['p']),
                        TreeNode.of(*sample['input']['q']),
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
