from unittest import main

from src.problems101_200.find_peak_element import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestFindPeakElement(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['input']['nums'][sample['output']],
                    solution.find_peak_element(sample['input']['nums']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
