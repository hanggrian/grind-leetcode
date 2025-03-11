from typing import override
from unittest import main

from src.problems1_100.jump_game2 import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestJumpGame2(SampledTest):
    @override
    def get_sample_filename(self) -> str:
        return 'jump-game-ii.json'

    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.jump(sample['input']['nums']),
                    sample['explanation'],
                )


if __name__ == '__main__':
    main()
