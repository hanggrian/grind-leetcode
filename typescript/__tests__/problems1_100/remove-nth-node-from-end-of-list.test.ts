import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems1_100/remove-nth-node-from-end-of-list';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    head: number[],
    n: number,
  },
  output: number[],
  message: string,
}

describe(
    'RemoveNthNodeFromEndOfList',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.removeNthFromEnd(
                                SinglyListNode.of(...sample.input.head),
                                sample.input.n,
                            ),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
