import unittest
from unittest import TestCase

from src.problems1_100.longest_common_prefix import SOLUTIONS
from tests.sample.samples import get_samples


class TestLongestCommonPrefix(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.longest_common_prefix(sample['input']['strs']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
