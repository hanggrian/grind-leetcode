import {strictEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/string-to-integer-atoi';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'StringToIntegerAtoi',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.myAtoi(sample.input.s),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
