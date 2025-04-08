from unittest import main

from src.problems301_400.decode_string import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestDecodeString(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.decode_string(sample['input']['s']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
