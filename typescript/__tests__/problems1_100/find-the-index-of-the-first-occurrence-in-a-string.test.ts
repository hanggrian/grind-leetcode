import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/find-the-index-of-the-first-occurrence-in-a-string';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    haystack: string,
    needle: string,
  },
  output: number,
  message: string,
}

describe(
    'FindTheIndexOfTheFirstOccurrenceInAString',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
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
