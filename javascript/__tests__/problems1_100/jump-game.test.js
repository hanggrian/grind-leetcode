import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/jump-game';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'JumpGame',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  strictEqual(
                      solution.canJump(sample.input.nums),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
