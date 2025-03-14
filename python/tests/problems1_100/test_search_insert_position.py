from unittest import main

from src.problems1_100.search_insert_position import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestSearchInsertPosition(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.search_insert(
                        sample['input']['nums'],
                        sample['input']['target'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
