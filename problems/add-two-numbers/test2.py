from json import load
from unittest import TestCase

from solution2 import SinglyListNode, add_two_numbers


class Test2(TestCase):
    def test(self):
        with open('sample.json', 'r', encoding='UTF-8') as json:
            for sample in load(json):
                self.assertEqual(
                    SinglyListNode.of(*sample['output']),
                    add_two_numbers(
                        SinglyListNode.of(*sample['input']['l1']),
                        SinglyListNode.of(*sample['input']['l2']),
                    ),
                    sample['explanation'],
                )
