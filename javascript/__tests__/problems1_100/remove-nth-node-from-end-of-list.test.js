import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems1_100/remove-nth-node-from-end-of-list';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RemoveNthNodeFromEndOfList',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  deepEqual(
                      solution.removeNthFromEnd(
                          SinglyListNode.of(...sample.input.head),
                          sample.input.n,
                      ),
                      SinglyListNode.of(...sample.output),
                      sample.message,
                  );
                });
              }),
      );
    },
);
