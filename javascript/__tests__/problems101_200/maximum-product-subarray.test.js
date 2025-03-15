import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/maximum-product-subarray';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MaximumProductSubarray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.maxProduct(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
