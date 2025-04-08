import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/intersection-of-two-arrays2';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'IntersectionOfTwoArrays2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('intersection-of-two-arrays-ii.json').forEach(sample =>
                        deepEqual(
                            solution.intersect(sample.input.nums1, sample.input.nums2),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
