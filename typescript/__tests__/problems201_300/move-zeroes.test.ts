import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/move-zeroes';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number[],
  message: string,
}

describe(
    'MoveZeroes',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) => {
                      const nums = sample.input.nums;
                      solution.moveZeroes(nums);
                      deepEqual(nums, sample.output, sample.message);
                    }),
                ),
        ),
);
