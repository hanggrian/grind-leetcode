import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/two-sum-ii-input-array-is-sorted';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'TwoSum2InputArrayIsSorted',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.twoSum(sample.input.numbers, sample.input.target),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
