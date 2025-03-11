import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems1_100/remove-duplicates-from-sorted-list';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RemoveDuplicatesFromSortedList',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  deepEqual(
                      solution.deleteDuplicates(SinglyListNode.of(...sample.input.head)),
                      SinglyListNode.of(...sample.output),
                      sample.message,
                  );
                });
              }),
      );
    },
);
