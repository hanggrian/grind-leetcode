import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems1_100/swap-nodes-in-pairs';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SwapNodesInPairs',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  getSamples().forEach(sample => {
                    deepEqual(
                        solution.swapPairs(SinglyListNode.of(...sample.input.head)),
                        SinglyListNode.of(...sample.output),
                        sample.message,
                    );
                  });
                }),
        ),
);
