import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/merge-intervals';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MergeIntervals',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.merge(sample.input.intervals),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
