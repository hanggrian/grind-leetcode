from unittest import main

from src.problems301_400.first_unique_character_in_a_string_test import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestFirstUniqueCharacterInAString(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.first_uniq_char(sample['input']['s']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
