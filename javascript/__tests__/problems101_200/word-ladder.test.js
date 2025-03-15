import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/word-ladder';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'WordLadder',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.ladderLength(
                                sample.input.beginWord,
                                sample.input.endWord,
                                sample.input.wordList,
                            ),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
