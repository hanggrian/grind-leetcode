import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/longest-common-prefix';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'LongestCommonPrefix',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
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
