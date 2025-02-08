import unittest
from typing import override

from problems.python.src.integer_to_roman import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestIntegerToRoman(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'integer_to_roman.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.int_to_roman(sample['input']['num']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
