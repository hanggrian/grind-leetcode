import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/ugly-number';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'UglyNumber',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.isUgly(sample.input.n),
                            sample.output,
                            sample.message,
                        )
                    ),
                ),
        ),
);
