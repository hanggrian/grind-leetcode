import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/pascals-triangle2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    rowIndex: number,
  },
  output: number[],
  message: string,
}

describe(
    'PascalsTriangle2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('pascals-triangle-ii.json').forEach((sample: Sample) =>
                        deepEqual(
                            solution.getRow(sample.input.rowIndex),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
