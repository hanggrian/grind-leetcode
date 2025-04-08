import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/palindrome-linked-list';
import getSamples from '../../../testing/js/src/sample/samples';
import SinglyListNode from '../../src/concepts/singly-list-node';

type Sample = {
  input: {
    head: number[],
  },
  output: boolean,
  message: string,
}

describe(
    'PalindromeLinkedList',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.isPalindrome(SinglyListNode.of(...sample.input.head)),
                            sample.output,
                            sample.message,
                        )
                    ),
                ),
        ),
);
