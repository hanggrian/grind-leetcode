import unittest
from typing import override

from problems.python.src.zigzag_conversion import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestZigzagConversion(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'zigzag_conversion.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.convert(
                        sample['input']['s'],
                        sample['input']['numRows'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
