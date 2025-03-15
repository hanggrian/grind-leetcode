import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/string-to-integer-atoi';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
  },
  output: number,
  message: string,
}

describe(
    'StringToIntegerAtoi',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.myAtoi(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
