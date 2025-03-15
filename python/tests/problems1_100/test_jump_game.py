from unittest import main

from src.problems1_100.jump_game import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestJumpGame(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.can_jump(sample['input']['nums']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
