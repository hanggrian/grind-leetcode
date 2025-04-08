from unittest import main

from src.problems201_300.ugly_number import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestUglyNumber(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_ugly(sample['input']['n']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
