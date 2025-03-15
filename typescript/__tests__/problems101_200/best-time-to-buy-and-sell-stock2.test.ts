import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/best-time-to-buy-and-sell-stock2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    prices: number[],
  },
  output: number,
  message: string,
}

describe(
    'BestTimeToBuyAndSellStock2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('best-time-to-buy-and-sell-stock-ii.json')
                        .forEach((sample: Sample) =>
                            strictEqual(
                                solution.maxProfit(sample.input.prices),
                                sample.output,
                                sample.message,
                            ),
                        ),
                ),
        ),
);
