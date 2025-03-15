import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/word-break';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'WordBreak',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.wordBreak(sample.input.s, sample.input.wordDict),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
