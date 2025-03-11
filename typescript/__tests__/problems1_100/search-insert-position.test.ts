import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/search-insert-position';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
    target: number,
  },
  output: number,
  message: string,
}

describe(
    'SearchInsertPosition',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach((sample: Sample) => {
                    strictEqual(
                        solution.searchInsert(
                            sample.input.nums,
                            sample.input.target,
                        ),
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
