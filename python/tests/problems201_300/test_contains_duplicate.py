from unittest import main

from src.problems201_300.contains_duplicate import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestContainsDuplicate(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.contains_duplicate(sample['input']['nums']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
