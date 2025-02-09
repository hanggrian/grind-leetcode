import unittest
from typing import override

from src.problems1.longest_common_prefix import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestLongestCommonPrefix(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'longest_common_prefix.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.longest_common_prefix(sample['input']['strs']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
