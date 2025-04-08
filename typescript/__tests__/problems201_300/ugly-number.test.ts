import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/ugly-number';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    n: number,
  },
  output: boolean,
  message: string,
}

describe(
    'UglyNumber',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.isUgly(sample.input.n),
                            sample.output,
                            sample.message,
                        )
                    ),
                ),
        ),
);
