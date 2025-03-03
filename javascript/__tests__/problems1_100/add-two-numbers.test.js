import {deepEqual} from 'assert';

import {SinglyListNode} from '../../src/concepts/list-nodes';
import {SOLUTIONS} from '../../src/problems1_100/add-two-numbers';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'AddTwoNumbers',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            deepEqual(
              SinglyListNode.of(...sample.output),
              solution.addTwoNumbers(
                SinglyListNode.of(...sample.input.l1),
                SinglyListNode.of(...sample.input.l2),
              ),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
