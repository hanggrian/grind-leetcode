import {ok} from 'assert';
import SOLUTIONS from '../../src/problems101_200/word-break2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
    wordDict: string[],
  },
  output: string[],
  message: string,
}

describe(
    'WordBreak2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('word-break-ii.json').forEach((sample: Sample) =>
                        sample.output.forEach(output =>
                            ok(
                                solution
                                    .wordBreak(sample.input.s, sample.input.wordDict)
                                    .includes(output),
                                sample.message,
                            ),
                        ),
                    ),
                ),
        ),
);
