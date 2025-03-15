import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems1_100/swap-nodes-in-pairs';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    head: number[],
  },
  output: number[],
  message: string,
}

describe(
    'SwapNodesInPairs',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.swapPairs(SinglyListNode.of(...sample.input.head)),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
