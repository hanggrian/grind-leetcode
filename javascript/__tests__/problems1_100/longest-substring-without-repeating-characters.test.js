import {strictEqual} from 'assert';

import {SOLUTIONS} from '../../src/problems1_100/longest-substring-without-repeating-characters';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'LongestSubstringWithoutRepeatingCharacters',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            strictEqual(
              sample.output,
              solution.lengthOfLongestSubstring(sample.input.s),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
