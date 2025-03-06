import {strictEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/search-insert-position';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SearchInsertPosition',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.searchInsert(
                        sample.input.nums,
                        sample.input.target,
                    ),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
