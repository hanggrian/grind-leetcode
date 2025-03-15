import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/remove-duplicates-from-sorted-array';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number,
  message: string,
}

describe(
    'RemoveDuplicatesFromSortedArray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) => {
                      strictEqual(
                          solution.removeDuplicates(sample.input.nums),
                          sample.output,
                          sample.message,
                      );

                      const subList = sample.input.nums.slice(0, sample.output);
                      strictEqual(new Set<number>(subList).size, subList.length);
                    }),
                ),
        ),
);
