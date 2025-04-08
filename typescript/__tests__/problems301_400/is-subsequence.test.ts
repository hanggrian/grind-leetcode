import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/is-subsequence';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
    t: string,
  },
  output: boolean,
  message: string,
}

describe(
    'IsSubsequence',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.isSubsequence(sample.input.s, sample.input.t),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
