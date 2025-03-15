import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/valid-sudoku';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    board: string[][],
  },
  output: boolean,
  message: string,
}

describe(
    'ValidSudoku',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.isValidSudoku(sample.input.board),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
