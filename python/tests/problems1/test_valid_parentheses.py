import unittest
from typing import override

from src.problems1.valid_parentheses import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestValidParentheses(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'valid_parentheses.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.is_valid(sample['input']['s']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
