from unittest import main

from src.concepts.list_nodes import SinglyListNode
from src.problems101_200.sort_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSortList(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.sort_list(SinglyListNode.of(*sample['input']['head'])),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
