import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/valid-parentheses';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ValidParentheses',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.isValid(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
