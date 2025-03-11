import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/jump-game2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number,
  message: string,
}

describe(
    'JumpGame2',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples('jump-game-ii.json').forEach((sample: Sample) => {
                  strictEqual(
                      solution.jump(sample.input.nums),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
