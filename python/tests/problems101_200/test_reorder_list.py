from unittest import main

from src.concepts.list_nodes import SinglyListNode
from src.problems101_200.reorder_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestReorderList(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                inp = SinglyListNode.of(*sample['input']['head'])
                solution.reorder_list(inp)
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    inp,
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
