import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/reverse-integer';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    x: number,
  },
  output: number,
  message: string,
}

describe(
    'ReverseInteger',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.reverse(sample.input.x),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
