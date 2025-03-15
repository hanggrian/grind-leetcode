from unittest import main

from src.concepts.singly_list_node import SinglyListNode
from src.problems1_100.add_two_numbers import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestAddTwoNumbers(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    solution.add_two_numbers(
                        SinglyListNode.of(*sample['input']['l1']),
                        SinglyListNode.of(*sample['input']['l2']),
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
