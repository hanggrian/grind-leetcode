from unittest import main

from src.problems1_100.zigzag_conversion import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestZigzagConversion(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.convert(
                        sample['input']['s'],
                        sample['input']['numRows'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
