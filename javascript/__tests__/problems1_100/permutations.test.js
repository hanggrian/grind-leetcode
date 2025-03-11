import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/permutations';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'Permutations',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  deepEqual(
                      solution.permute(sample.input.nums),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
