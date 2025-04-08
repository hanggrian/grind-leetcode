import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/house-robber2';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'HouseRobber2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('house-robber-ii.json').forEach(sample =>
                        strictEqual(
                            solution.rob(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
