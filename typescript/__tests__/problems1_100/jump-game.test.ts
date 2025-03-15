import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/jump-game';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: boolean,
  message: string,
}

describe(
    'JumpGame',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.canJump(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
