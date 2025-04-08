import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/delete-node-in-a-linked-list';
import getSamples from '../../../testing/js/src/sample/samples';
import SinglyListNode from '../../src/concepts/singly-list-node';

type Sample = {
  input: {
    head: number[],
    node: number,
  },
  output: number[],
  message: string,
}

describe(
    'DeleteNodeInALinkedList',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) => {
                      const head = SinglyListNode.of(...sample.input.head);
                      if (sample.input.node > -1) {
                        solution.deleteNode(head.toArray().find(n => n.val === sample.input.node));
                      }
                      deepEqual(head, SinglyListNode.of(...sample.output), sample.message);
                    }),
                ),
        ),
);
