import unittest
from unittest import TestCase

from src.problems1_100.find_the_index_of_the_first_occurrence_in_a_string import SOLUTIONS
from tests.sample.samples import get_samples


class TestFindTheIndexOfTheFirstOccurrenceInAString(TestCase):
    def test(self):
        for solution in SOLUTIONS:
            for sample in get_samples():
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
