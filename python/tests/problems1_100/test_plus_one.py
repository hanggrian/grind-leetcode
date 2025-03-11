from unittest import main

from src.problems1_100.plus_one import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestPlusOne(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.plus_one(sample['input']['digits']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
