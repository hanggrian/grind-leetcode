import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/palindrome-number';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    x: number,
  },
  output: boolean,
  message: string,
}

describe(
    'PalindromeNumber',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  strictEqual(
                      solution.isPalindrome(sample.input.x),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
