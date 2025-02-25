import unittest

from src.problems1_100.reverse_integer import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestReverseInteger(SampledTest):
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
