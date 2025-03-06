import {deepEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/zigzag-conversion';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ZigzagConversion',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                deepEqual(
                    sample.output,
                    solution.convert(
                        sample.input.s,
                        sample.input.numRows,
                    ),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
