import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/plus-one';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'PlusOne',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  deepEqual(
                      solution.plusOne(sample.input.digits),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
