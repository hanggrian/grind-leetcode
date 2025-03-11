import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems1_100/add-two-numbers';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'AddTwoNumbers',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  deepEqual(
                      solution.addTwoNumbers(
                          SinglyListNode.of(...sample.input.l1),
                          SinglyListNode.of(...sample.input.l2),
                      ),
                      SinglyListNode.of(...sample.output),
                      sample.message,
                  );
                });
              }),
      );
    },
);
