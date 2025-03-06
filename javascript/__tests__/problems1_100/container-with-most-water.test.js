import {strictEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/container-with-most-water';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ContainerWithMostWater',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.maxArea(sample.input.height),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
