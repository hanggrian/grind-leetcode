import {strictEqual} from 'assert';
import {SOLUTIONS} from '../../src/problems1_100/median-of-two-sorted-arrays';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MedianOfTwoSortedArrays',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                strictEqual(
                    sample.output,
                    solution.findMedianSortedArrays(
                        sample.input.nums1,
                        sample.input.nums2,
                    ),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
