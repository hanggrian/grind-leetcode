import {deepEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/two-sum';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'TwoSum',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                deepEqual(
                    sample.output,
                    solution.twoSum(
                        sample.input.nums,
                        sample.input.target,
                    ),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
