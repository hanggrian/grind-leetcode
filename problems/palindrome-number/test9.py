from json import load
from unittest import TestCase

from solution9 import ReverseString, CompareHalfString


class Test9(TestCase):
    def test(self):
        with open('sample.json', 'r', encoding='UTF-8') as json:
            for sample in load(json):
                self.assertEqual(
                    sample['output'],
                    ReverseString.is_palindrome(sample['input']),
                    sample['explanation'],
                )
                self.assertEqual(
                    sample['output'],
                    CompareHalfString.is_palindrome(sample['input']),
                    sample['explanation'],
                )
