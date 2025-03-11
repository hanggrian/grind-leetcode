import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/integer-to-roman';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    num: number,
  },
  output: string,
  message: string,
}

describe(
    'IntegerToRoman',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  strictEqual(
                      solution.intToRoman(sample.input.num),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
