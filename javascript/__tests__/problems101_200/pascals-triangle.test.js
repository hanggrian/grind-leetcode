import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/pascals-triangle';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'PascalsTriangle',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.generate(sample.input.numRows),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
