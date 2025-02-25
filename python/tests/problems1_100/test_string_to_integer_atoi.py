import unittest

from src.problems1_100.string_to_integer_atoi import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestStringToIntegerAtoi(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.my_atoi(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
