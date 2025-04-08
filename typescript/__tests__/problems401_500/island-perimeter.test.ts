import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems401_500/island-perimeter';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    grid: number[][],
  },
  output: number,
  message: string,
}

describe(
    'IslandPerimeter',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.islandPerimeter(sample.input.grid),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
