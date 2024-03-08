from json import load
from unittest import TestCase

from solution141 import SinglyListNode, RememberVisits, FastSlowPointers


class Test141(TestCase):
    def test(self):
        with open('sample.json', 'r', encoding='UTF-8') as json:
            for sample in load(json):
                node = SinglyListNode.of(*sample['input']['head'])
                if sample['input']['pos'] > -1:
                    node.iterate_last().next = node.iterate_to(sample['input']['pos'])
                self.assertEqual(
                    sample['output'],
                    RememberVisits.has_cycle(node),
                    sample['explanation'],
                )
                self.assertEqual(
                    sample['output'],
                    FastSlowPointers.has_cycle(node),
                    sample['explanation'],
                )
