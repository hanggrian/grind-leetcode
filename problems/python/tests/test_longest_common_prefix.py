import unittest
from typing import override

from problems.python.src.longest_common_prefix import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestLongestCommonPrefix(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'longest_common_prefix.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.longest_common_prefix(sample['input']['strs']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
