import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/house-robber';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'HouseRobber',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.rob(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
