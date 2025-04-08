import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/sliding-window-maximum';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SlidingWindowMaximum',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.maxSlidingWindow(sample.input.nums, sample.input.k),
                            sample.output,
                            sample.message,
                        )
                    ),
                ),
        ),
);
