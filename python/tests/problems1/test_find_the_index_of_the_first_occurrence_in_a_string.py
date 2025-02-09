import unittest
from typing import override

from src.problems1.find_the_index_of_the_first_occurrence_in_a_string import SOLUTIONS
from tests.testing.sampled_test import SampledTest


class TestFindTheIndexOfTheFirstOccurrenceInAString(SampledTest):
    @override
    def get_file_name(self) -> str:
        return 'find_the_index_of_the_first_occurrence_in_a_string.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.str_str(
                        sample['input']['haystack'],
                        sample['input']['needle'],
                    ),
                    sample['explanation'],
                )


if __name__ == '__main__':
    unittest.main()
