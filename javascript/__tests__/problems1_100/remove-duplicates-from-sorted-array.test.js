import {strictEqual} from 'assert';

import {SOLUTIONS} from '../../src/problems1_100/remove-duplicates-from-sorted-array';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'RemoveDuplicatesFromSortedArray',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            strictEqual(
              sample.output,
              solution.removeDuplicates(sample.input.nums),
              sample.explanation,
            );

            let sub_list = sample.input.nums.slice(0, sample.output);
            strictEqual(new Set(sub_list).size, sub_list.length);
          }
        }
      },
    );
  },
);
