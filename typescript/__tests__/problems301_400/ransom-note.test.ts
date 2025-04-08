import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/ransom-note';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    ransomNote: string,
    magazine: string,
  },
  output: boolean,
  message: string,
}

describe(
    'RansomNote',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.canConstruct(sample.input.ransomNote, sample.input.magazine),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
