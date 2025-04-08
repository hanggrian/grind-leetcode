from unittest import main

from src.problems301_400.ransom_note import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestRansomNote(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.can_construct(
                        sample['input']['ransomNote'],
                        sample['input']['magazine'],
                    ),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
