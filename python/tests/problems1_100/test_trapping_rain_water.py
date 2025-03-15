from unittest import main

from src.problems1_100.trapping_rain_water import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestTrappingRainWater(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.trap(sample['input']['height']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
