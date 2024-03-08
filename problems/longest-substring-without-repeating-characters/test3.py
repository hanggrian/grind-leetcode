from json import load
from unittest import TestCase

from solution3 import length_of_longest_substring


class Test3(TestCase):
    def test(self):
        with open('sample.json', 'r', encoding='UTF-8') as json:
            for sample in load(json):
                self.assertEqual(
                    sample['output'],
                    length_of_longest_substring(sample['input']),
                    sample['explanation'],
                )
