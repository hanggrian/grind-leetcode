import {strictEqual} from 'assert';

import {SinglyListNode} from '../../src/concepts/list-nodes';
import {SOLUTIONS} from '../../src/problems101_200/linked-list-cycle';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'LinkedListCycle',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            let inp = SinglyListNode.of(...sample.input.head);
            if (sample.input.pos > -1) {
              inp.iterateLast().next = inp.iterateTo(sample.input.pos);
            }
            strictEqual(
              sample.output,
              solution.hasCycle(inp),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
