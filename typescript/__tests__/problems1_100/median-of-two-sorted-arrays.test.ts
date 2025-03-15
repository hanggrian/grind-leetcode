import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/median-of-two-sorted-arrays';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums1: number[],
    nums2: number[],
  },
  output: number,
  message: string,
}

describe(
    'MedianOfTwoSortedArrays',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.findMedianSortedArrays(
                                sample.input.nums1,
                                sample.input.nums2,
                            ),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
