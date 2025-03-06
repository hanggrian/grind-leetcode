import {strictEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/reverse-integer';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ReverseInteger',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.reverse(sample.input.x),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
