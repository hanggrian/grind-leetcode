import unittest
from unittest import TestCase

from src.concepts.list_nodes import SinglyListNode
from src.problems101_200.linked_list_cycle import SOLUTIONS
from tests.sample.samples import get_samples


class TestLinkedListCycle(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                inp = SinglyListNode.of(*sample['input']['head'])
                if sample['input']['pos'] > -1:
                    inp.iterate_last().next = inp.iterate_to(sample['input']['pos'])
                self.assertEqual(
                    sample['output'],
                    solution.has_cycle(inp),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
