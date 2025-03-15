import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/maximum-subarray';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MaximumSubarray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.maxSubArray(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
