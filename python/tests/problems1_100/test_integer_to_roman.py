from unittest import main

from src.problems1_100.integer_to_roman import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestIntegerToRoman(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.int_to_roman(sample['input']['num']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
