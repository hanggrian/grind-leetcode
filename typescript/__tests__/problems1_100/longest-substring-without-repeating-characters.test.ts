import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/longest-substring-without-repeating-characters';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    s: string,
  },
  output: number,
  message: string,
}

describe(
    'LongestSubstringWithoutRepeatingCharacters',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.lengthOfLongestSubstring(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
