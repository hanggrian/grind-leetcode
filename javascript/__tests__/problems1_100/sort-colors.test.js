import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/sort-colors';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SortColors',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample => {
                      const nums = sample.input.nums;
                      solution.sortColors(nums);
                      deepEqual(
                          nums,
                          sample.output,
                          sample.message,
                      );
                    }),
                ),
        ),
);
