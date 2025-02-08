import unittest
from typing import override

from problems.python.src.string_to_integer_atoi import SOLUTIONS
from problems.python.tests.testing.sampled_test import SampledTest


class TestStringToIntegerAtoi(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'string_to_integer_atoi.json'

    def test(self):
        for sample in self.get_samples():
            for solution in SOLUTIONS:
                self.assertEqual(
                    sample['output'],
                    solution.my_atoi(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
