import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/three-sum';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ThreeSum',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.threeSum(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
