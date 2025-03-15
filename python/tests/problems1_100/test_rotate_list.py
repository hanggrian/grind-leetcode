from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems1_100.rotate_list import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRotateList(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.rotate_right(
                        SinglyListNode.of(*sample['input']['head']),
                        sample['input']['k'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
