from unittest import main

from src.problems1_100.remove_element import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRemoveElement(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.remove_element(
                        sample['input']['nums'],
                        sample['input']['val'],
                    ),
                    sample['explanation'],
                )
                self.assertTrue(
                    sample['input']['val'] not in sample['input']['nums'][:sample['output']],
                )


if __name__ == '__main__':
    main()
