from unittest import main

from src.problems1_100.longest_common_prefix import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestLongestCommonPrefix(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.longest_common_prefix(sample['input']['strs']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
