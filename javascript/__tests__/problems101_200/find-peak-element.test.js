import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/find-peak-element';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'FindPeakElement',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.findPeakElement(sample.input.nums),
                            sample.input.nums[sample.output],
                            sample.message,
                        ),
                    ),
                ),
        ),
);
