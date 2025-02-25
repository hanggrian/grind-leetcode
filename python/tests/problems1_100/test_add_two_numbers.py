import unittest

from src.concepts.list_nodes import SinglyListNode
from src.problems1_100.add_two_numbers import SOLUTIONS
from tests.testing.sampled_test import SampledTest


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
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
