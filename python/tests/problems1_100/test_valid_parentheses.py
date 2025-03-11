from unittest import main

from src.problems1_100.valid_parentheses import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestValidParentheses(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_valid(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
