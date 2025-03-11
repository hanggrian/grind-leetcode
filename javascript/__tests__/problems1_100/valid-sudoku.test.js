import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/valid-sudoku';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ValidSudoku',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach(sample => {
                    strictEqual(
                        solution.isValidSudoku(sample.input.board),
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
