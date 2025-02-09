import unittest
from typing import override

from src.problems1.zigzag_conversion import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestZigzagConversion(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'zigzag_conversion.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
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
