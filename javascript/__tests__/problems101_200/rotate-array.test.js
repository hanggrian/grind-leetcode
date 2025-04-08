import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/rotate-array';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RotateArray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample => {
                      const nums = sample.input.nums;
                      solution.rotate(nums, sample.input.k);
                      deepEqual(
                          nums,
                          sample.output,
                          sample.message,
                      );
                    }),
                ),
        ),
);
