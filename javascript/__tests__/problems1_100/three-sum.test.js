import {deepEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/three-sum';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ThreeSum',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                deepEqual(
                    sample.output,
                    solution.threeSum(sample.input.nums),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
