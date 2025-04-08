import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/number-of-islands';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    grid: string[][],
  },
  output: number,
  message: string,
}

describe(
    'NumberOfIslands',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.numIslands(sample.input.grid),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
