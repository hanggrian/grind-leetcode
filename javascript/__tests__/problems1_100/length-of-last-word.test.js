import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/length-of-last-word';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'LengthOfLastWord',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  strictEqual(
                      solution.lengthOfLastWord(sample.input.s),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
