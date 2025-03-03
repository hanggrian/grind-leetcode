import {strictEqual} from 'assert';

import {SOLUTIONS} from '../../src/problems1_100/integer-to-roman';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'IntegerToRoman',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            strictEqual(
              sample.output,
              solution.intToRoman(sample.input.num),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);

