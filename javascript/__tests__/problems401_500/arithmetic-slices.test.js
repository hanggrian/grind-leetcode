import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems401_500/arithmetic-slices';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ArithmeticSlices',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.numberOfArithmeticSlices(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
