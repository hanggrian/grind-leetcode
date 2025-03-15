import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/climbing-stairs';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ClimbingStairs',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.climbStairs(sample.input.n),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
