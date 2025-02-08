import unittest
from typing import override

from problems.python.src.roman_to_integer import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestRomanToInteger(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'roman_to_integer.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.roman_to_int(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
