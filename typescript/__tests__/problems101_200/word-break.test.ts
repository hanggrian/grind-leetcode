import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/word-break';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
    wordDict: string[],
  },
  output: boolean,
  message: string,
}

describe(
    'WordBreak',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.wordBreak(sample.input.s, sample.input.wordDict),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
