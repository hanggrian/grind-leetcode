import unittest
from typing import override

from src.problems1.roman_to_integer import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestRomanToInteger(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'roman_to_integer.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.roman_to_int(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
