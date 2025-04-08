import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/reverse-string';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ReverseString',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample => {
                      const s = sample.input.s;
                      solution.reverseString(s);
                      deepEqual(s, sample.output, sample.message);
                    }),
                ),
        ),
);
