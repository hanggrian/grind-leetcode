import {strictEqual, ok} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/remove-element';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RemoveElement',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.removeElement(
                        sample.input.nums,
                        sample.input.val,
                    ),
                    sample.explanation,
                );
                ok(
                    !sample.input.nums.slice(0, sample.output).includes(sample.input.val),
                );
              }
            }
          },
      );
    },
);
