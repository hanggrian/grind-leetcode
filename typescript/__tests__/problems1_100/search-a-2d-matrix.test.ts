import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/search-a-2d-matrix';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    matrix: number[][],
    target: number,
  },
  output: boolean,
  message: string,
}

describe(
    'SearchA2dMatrix',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.searchMatrix(sample.input.matrix, sample.input.target),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
