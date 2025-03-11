import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/three-sum';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number[][],
  message: string,
}

describe(
    'ThreeSum',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach((sample: Sample) => {
                    deepEqual(
                        solution.threeSum(sample.input.nums),
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
