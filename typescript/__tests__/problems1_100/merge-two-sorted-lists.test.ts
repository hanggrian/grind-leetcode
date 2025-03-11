import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems1_100/merge-two-sorted-lists';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    list1: number[],
    list2: number[],
  },
  output: number[],
  message: string,
}

describe(
    'MergeTwoSortedLists',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
                  deepEqual(
                      solution.mergeTwoLists(
                          SinglyListNode.of(...sample.input.list1),
                          SinglyListNode.of(...sample.input.list2),
                      ),
                      SinglyListNode.of(...sample.output),
                      sample.message,
                  );
                });
              }),
      );
    },
);
