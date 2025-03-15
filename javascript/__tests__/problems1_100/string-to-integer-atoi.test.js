import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/string-to-integer-atoi';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'StringToIntegerAtoi',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.myAtoi(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
