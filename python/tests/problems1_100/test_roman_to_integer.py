from unittest import main

from src.problems1_100.roman_to_integer import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRomanToInteger(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.roman_to_int(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
