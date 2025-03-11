import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/word-search';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'WordSearch',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach(sample => {
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
