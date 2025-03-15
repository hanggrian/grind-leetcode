import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/single-number';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: number,
  message: string,
}

describe(
    'SingleNumber',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.singleNumber(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
