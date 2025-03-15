import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/plus-one';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    digits: number[],
  },
  output: number[],
  message: string,
}

describe(
    'PlusOne',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.plusOne(sample.input.digits),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
