import {strictEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/longest-palindromic-substring';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'LongestPalindromicSubstring',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.longestPalindrome(sample.input.s),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
