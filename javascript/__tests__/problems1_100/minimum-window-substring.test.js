import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/minimum-window-substring';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MinimumWindowSubstring',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.minWindow(sample.input.s, sample.input.t),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
