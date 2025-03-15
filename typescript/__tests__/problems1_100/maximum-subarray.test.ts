import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/maximum-subarray';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number,
  message: string,
}

describe(
    'MaximumSubarray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.maxSubArray(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
