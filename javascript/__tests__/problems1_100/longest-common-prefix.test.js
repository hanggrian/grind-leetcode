import {strictEqual} from 'assert';

import {SOLUTIONS} from '../../src/problems1_100/longest-common-prefix';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'LongestCommonPrefix',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            strictEqual(
              sample.output,
              solution.longestCommonPrefix(sample.input.strs),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
