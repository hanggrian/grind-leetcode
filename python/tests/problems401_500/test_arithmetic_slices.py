from unittest import main

from src.problems401_500.arithmetic_slices import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestArithmeticSlices(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.number_of_arithmetic_slices(sample['input']['nums']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
