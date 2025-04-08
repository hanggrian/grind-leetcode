import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/reverse-linked-list';
import getSamples from '../../../testing/js/src/sample/samples';
import SinglyListNode from '../../src/concepts/singly-list-node';

type Sample = {
  input: {
    head: number[],
  },
  output: number[],
  message: string,
}

describe(
    'ReverseLinkedList',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.reverseList(SinglyListNode.of(...sample.input.head)),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        )
                    ),
                ),
        ),
);
