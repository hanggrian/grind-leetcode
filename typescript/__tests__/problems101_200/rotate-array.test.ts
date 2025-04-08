import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/rotate-array';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
    input: {
        nums: number[],
        k: number,
    },
    output: number[],
    message: string,
}

describe(
    'RotateArray',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) => {
                        const nums = sample.input.nums;
                        solution.rotate(nums, sample.input.k);
                        deepEqual(
                            nums,
                            sample.output,
                            sample.message,
                        );
                    }),
                ),
        ),
);
