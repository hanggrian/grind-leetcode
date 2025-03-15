import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/find-peak-element';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number,
  message: string,
}

describe(
    'FindPeakElement',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.findPeakElement(sample.input.nums),
                            sample.input.nums[sample.output],
                            sample.message,
                        ),
                    ),
                ),
        ),
);
