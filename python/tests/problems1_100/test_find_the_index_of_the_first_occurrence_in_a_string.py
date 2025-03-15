from unittest import main

from src.problems1_100.find_the_index_of_the_first_occurrence_in_a_string import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestFindTheIndexOfTheFirstOccurrenceInAString(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.str_str(
                        sample['input']['haystack'],
                        sample['input']['needle'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
