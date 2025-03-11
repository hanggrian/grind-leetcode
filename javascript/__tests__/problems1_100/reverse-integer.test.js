import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/reverse-integer';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ReverseInteger',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  strictEqual(
                      solution.reverse(sample.input.x),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
