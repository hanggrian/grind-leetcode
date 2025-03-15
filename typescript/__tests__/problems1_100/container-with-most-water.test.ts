import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/container-with-most-water';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    height: number[],
  },
  output: number,
  message: string,
}

describe(
    'ContainerWithMostWater',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.maxArea(sample.input.height),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
