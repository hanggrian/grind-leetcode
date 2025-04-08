import {strictEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems101_200/linked-list-cycle';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'LinkedListCycle',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample => {
                      const head = SinglyListNode.of(...sample.input.head);
                      if (sample.input.pos > -1) {
                        head.iterateLast().next = head.iterateTo(sample.input.pos);
                      }
                      strictEqual(
                          solution.hasCycle(head),
                          sample.output,
                          sample.message,
                      );
                    }),
                ),
        ),
);
