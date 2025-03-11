import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/search-a-2d-matrix';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SearchA2dMatrix',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach(sample => {
                    strictEqual(
                        solution.searchMatrix(sample.input.matrix, sample.input.target),
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
