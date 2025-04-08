import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/first-unique-character-in-a-string';
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
                            solution.firstUniqChar(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
