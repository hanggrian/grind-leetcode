import {ok, strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/remove-element';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RemoveElement',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  strictEqual(
                      solution.removeElement(
                          sample.input.nums,
                          sample.input.val,
                      ),
                      sample.output,
                      sample.message,
                  );
                  ok(!sample.input.nums.slice(0, sample.output).includes(sample.input.val));
                });
              }),
      );
    },
);
