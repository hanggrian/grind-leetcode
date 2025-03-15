import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/merge-intervals';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    intervals: number[][],
  },
  output: number[][],
  message: string,
}

describe(
    'MergeIntervals',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.merge(sample.input.intervals),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
