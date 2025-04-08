import {strictEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems101_200/linked-list-cycle2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    head: number[],
    pos: number,
  },
  output: number[],
  message: string,
}

describe(
    'LinkedListCycle2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('linked-list-cycle-ii.json').forEach((sample: Sample) => {
                      const head = SinglyListNode.of(...sample.input.head);
                      let result = undefined;
                      if (sample.input.pos > -1) {
                        result = head.iterateTo(sample.input.pos);
                        head.iterateLast().next = result;
                      }
                      strictEqual(
                          solution.detectCycle(head),
                          result,
                          sample.message,
                      );
                    }),
                ),
        ),
);
