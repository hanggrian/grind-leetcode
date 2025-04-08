import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/decode-string';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'DecodeString',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.decodeString(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
