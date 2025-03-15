from unittest import main

from src.problems101_200.single_number import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSingleNumber(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.single_number(sample['input']['nums']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
