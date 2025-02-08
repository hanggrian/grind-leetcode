import unittest
from typing import override

from problems.python.src.reverse_integer import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestReverseInteger(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'reverse_integer.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.reverse(sample['input']['x']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
