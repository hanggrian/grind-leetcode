import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/maximum-product-subarray';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number,
  message: string,
}

describe(
    'MaximumProductSubarray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.maxProduct(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
