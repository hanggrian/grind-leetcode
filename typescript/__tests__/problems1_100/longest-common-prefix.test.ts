import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/longest-common-prefix';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    strs: string[],
  },
  output: string,
  message: string,
}

describe(
    'LongestCommonPrefix',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  strictEqual(
                      solution.longestCommonPrefix(sample.input.strs),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
