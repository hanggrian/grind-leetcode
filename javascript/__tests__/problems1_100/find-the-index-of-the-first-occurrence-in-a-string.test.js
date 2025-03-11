import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/find-the-index-of-the-first-occurrence-in-a-string';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'FindTheIndexOfTheFirstOccurrenceInAString',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  strictEqual(
                      solution.strStr(
                          sample.input.haystack,
                          sample.input.needle,
                      ),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
