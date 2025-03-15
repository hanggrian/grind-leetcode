import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems1_100/add-two-numbers';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    l1: number[],
    l2: number[],
  },
  output: number[],
  message: string,
}

describe(
    'AddTwoNumbers',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.addTwoNumbers(
                                SinglyListNode.of(...sample.input.l1),
                                SinglyListNode.of(...sample.input.l2),
                            ),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
