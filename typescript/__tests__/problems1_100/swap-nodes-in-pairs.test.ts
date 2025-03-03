import {deepEqual} from 'assert';

import {SinglyListNode} from '../../src/concepts/list-nodes';
import {SOLUTIONS} from '../../src/problems1_100/swap-nodes-in-pairs';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
  'SwapNodesInPairs',
  () => {
    test(
      'test',
      () => {
        for (let solution of SOLUTIONS) {
          for (let sample of getSamples()) {
            deepEqual(
              SinglyListNode.of(...sample.output),
              solution.swapPairs(SinglyListNode.of(...sample.input.head)),
              sample.explanation,
            );
          }
        }
      },
    );
  },
);
