import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/house-robber2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number,
  message: string,
}

describe(
    'HouseRobber2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('house-robber-ii.json').forEach((sample: Sample) =>
                        strictEqual(
                            solution.rob(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
