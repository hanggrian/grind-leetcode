from unittest import main

from src.problems1_100.reverse_integer import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestReverseInteger(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.reverse(sample['input']['x']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
