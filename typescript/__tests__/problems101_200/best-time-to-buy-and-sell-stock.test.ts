import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/best-time-to-buy-and-sell-stock';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    prices: number[],
  },
  output: number,
  message: string,
}

describe(
    'BestTimeToBuyAndSellStock',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  strictEqual(
                      solution.maxProfit(sample.input.prices),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
