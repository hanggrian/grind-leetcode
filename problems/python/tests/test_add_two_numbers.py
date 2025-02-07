import unittest
from typing import override

from concepts.python.src.list_nodes import SinglyListNode
from problems.python.src.add_two_numbers import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestAddTwoNumbers(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'add_two_numbers.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
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
