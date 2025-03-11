import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/sort-colors';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number[],
  message: string,
}

describe(
    'SortColors',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach((sample: Sample) => {
                    const nums = sample.input.nums;
                    solution.sortColors(nums);
                    deepEqual(
                        nums,
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
