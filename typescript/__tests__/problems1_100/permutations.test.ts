import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/permutations';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number[][],
  message: string,
}

describe(
    'Permutations',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  deepEqual(
                      solution.permute(sample.input.nums),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
