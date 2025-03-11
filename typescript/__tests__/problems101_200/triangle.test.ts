import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/triangle';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    triangle: number[][],
  },
  output: number,
  message: string,
}

describe(
    'Triangle',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  strictEqual(
                      solution.minimumTotal(sample.input.triangle),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
