import {strictEqual} from 'assert';

import {SOLUTIONS} from '../../src/problems1_100/valid-parentheses';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'ValidParentheses',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            strictEqual(
              sample.output,
              solution.isValid(sample.input.s),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
