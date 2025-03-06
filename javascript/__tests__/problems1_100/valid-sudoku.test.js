import {strictEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/valid-sudoku';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ValidSudoku',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.isValidSudoku(sample.input.board),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
