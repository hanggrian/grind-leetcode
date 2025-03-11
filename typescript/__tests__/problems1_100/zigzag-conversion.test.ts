import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/zigzag-conversion';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
    numRows: number,
  },
  output: string,
  message: string,
}

describe(
    'ZigzagConversion',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach((sample: Sample) => {
                    strictEqual(
                        solution.convert(
                            sample.input.s,
                            sample.input.numRows,
                        ),
                        sample.output,
                        sample.message,
                    );
                  });
                }),
        ),
);
