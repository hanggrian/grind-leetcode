import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/trapping-rain-water';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    height: number[],
  },
  output: number,
  message: string,
}

describe(
    'TrappingRainWater',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach((sample: Sample) => {
                    strictEqual(
                        solution.trap(sample.input.height),
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
