import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/valid-palindrome';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
  },
  output: boolean,
  message: string,
}

describe(
    'ValidPalindrome',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.isPalindrome(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
