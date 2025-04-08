from unittest import main

from src.concepts.tree_node import TreeNode
from src.problems201_300.count_complete_tree_nodes import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestCountCompleteTreeNodes(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.count_nodes(TreeNode.of(*sample['input']['root'])),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
