import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/first-unique-character-in-a-string';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
  },
  output: number,
  message: string,
}

describe(
    'DecodeString',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.firstUniqChar(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
