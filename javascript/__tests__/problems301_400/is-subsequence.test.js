import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/is-subsequence';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'IsSubsequence',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.isSubsequence(sample.input.s, sample.input.t),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
