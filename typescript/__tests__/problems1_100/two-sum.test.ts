import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/two-sum';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
    target: number,
  },
  output: number[],
  message: string,
}

describe(
    'TwoSum',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.twoSum(
                                sample.input.nums,
                                sample.input.target,
                            ),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
