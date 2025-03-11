import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems1_100/reverse-linked-list2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    head: number[],
    left: number,
    right: number,
  },
  output: number[],
  message: string,
}

describe(
    'ReverseLinkedList2',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples('reverse-linked-list-ii.json').forEach((sample: Sample) => {
                  deepEqual(
                      solution.reverseBetween(
                          SinglyListNode.of(...sample.input.head),
                          sample.input.left,
                          sample.input.right,
                      ),
                      SinglyListNode.of(...sample.output),
                      sample.message,
                  );
                });
              }),
      );
    },
);
