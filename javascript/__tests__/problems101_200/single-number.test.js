import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/single-number';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SingleNumber',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.singleNumber(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
