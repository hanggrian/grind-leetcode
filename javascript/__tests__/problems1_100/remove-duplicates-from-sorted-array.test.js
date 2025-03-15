import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/remove-duplicates-from-sorted-array';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RemoveDuplicatesFromSortedArray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample => {
                      strictEqual(
                          solution.removeDuplicates(sample.input.nums),
                          sample.output,
                          sample.message,
                      );

                      const subList = sample.input.nums.slice(0, sample.output);
                      strictEqual(new Set(subList).size, subList.length);
                    }),
                ),
        ),
);
