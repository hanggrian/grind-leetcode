import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/word-search';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    board: string[][],
    word: string,
  },
  output: boolean,
  message: string,
}

describe(
    'WordSearch',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach((sample: Sample) => {
                    strictEqual(
                        solution.exist(
                            sample.input.board,
                            sample.input.word,
                        ),
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
