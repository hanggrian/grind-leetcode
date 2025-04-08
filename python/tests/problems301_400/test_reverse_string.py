from unittest import main

from src.problems301_400.reverse_string import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestReverseString(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                s = sample['input']['s']
                solution.reverse_string(s)
                self.assertEqual(sample['output'], s, sample['message'])


if __name__ == '__main__':
    main()
