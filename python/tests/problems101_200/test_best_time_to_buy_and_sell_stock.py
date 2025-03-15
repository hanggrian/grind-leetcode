from unittest import main

from src.problems101_200.best_time_to_buy_and_sell_stock import SOLUTIONS
from tests.sample.sampled_test import SampledTest


class TestBestTimeToBuyAndSellStock(SampledTest):
    def test(self):
        for solution in SOLUTIONS:
            for sample in self.get_samples():
                self.assertEqual(
                    sample['output'],
                    solution.max_profit(sample['input']['prices']),
                    sample['message'],
                )


if __name__ == '__main__':
    main()
