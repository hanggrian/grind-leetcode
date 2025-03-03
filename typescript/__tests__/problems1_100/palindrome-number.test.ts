import {strictEqual} from 'assert';

import {SOLUTIONS} from '../../src/problems1_100/palindrome-number';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'PalindromeNumber',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            strictEqual(
              sample.output,
              solution.isPalindrome(sample.input.x),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
