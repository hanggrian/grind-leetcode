import unittest
from typing import override

from src.problems1.reverse_integer import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestReverseInteger(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'reverse_integer.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.reverse(sample['input']['x']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
