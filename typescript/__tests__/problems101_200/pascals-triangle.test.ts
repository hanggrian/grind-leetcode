import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/pascals-triangle';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    numRows: number,
  },
  output: number[][],
  message: string,
}

describe(
    'PascalsTriangle',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  deepEqual(
                      solution.generate(sample.input.numRows),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
