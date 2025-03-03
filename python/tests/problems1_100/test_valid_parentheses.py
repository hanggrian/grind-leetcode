import unittest
from unittest import TestCase

from src.problems1_100.valid_parentheses import SOLUTIONS
from tests.sample.samples import get_samples


class TestValidParentheses(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_valid(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
