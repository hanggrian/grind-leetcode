import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/pascals-triangle2';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'PascalsTriangle2',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples('pascals-triangle-ii.json').forEach(sample => {
                  deepEqual(
                      solution.getRow(sample.input.rowIndex),
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
