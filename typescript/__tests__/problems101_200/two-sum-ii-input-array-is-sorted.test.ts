import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/two-sum-ii-input-array-is-sorted';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    numbers: number[],
    target: number,
  },
  output: number[],
  message: string,
}

describe(
    'TwoSum2InputArrayIsSorted',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.twoSum(sample.input.numbers, sample.input.target),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
