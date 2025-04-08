import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/odd-even-linked-list';
import getSamples from '../../../testing/js/src/sample/samples';
import SinglyListNode from '../../src/concepts/singly-list-node';

describe(
    'OddEvenLinkedList',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.oddEvenList(SinglyListNode.of(...sample.input.head)),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
