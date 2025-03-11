import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/merge-sorted-array';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums1: number[],
    m: number,
    nums2: number[],
    n: number,
  },
  output: number[],
  message: string,
}

describe(
    'MergeSortedArray',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  const nums1 = sample.input.nums1;
                  const nums2 = sample.input.nums2;
                  solution.merge(nums1, sample.input.m, nums2, sample.input.n);
                  deepEqual(
                      nums1,
                      sample.output,
                      sample.message,
                  );
                });
              }),
      );
    },
);
