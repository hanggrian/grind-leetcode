from json import load
from unittest import TestCase

from solution1 import BruteForce, SinglePass


class Test1(TestCase):
    def test(self):
        with open('sample.json', 'r', encoding='UTF-8') as json:
            for sample in load(json):
                self.assertEqual(
                    sample['output'],
                    BruteForce.two_sum(sample['input']['nums'], sample['input']['target']),
                    sample['explanation'],
                )
                self.assertEqual(
                    sample['output'],
                    SinglePass.two_sum(sample['input']['nums'], sample['input']['target']),
                    sample['explanation'],
                )
