import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems1_100/remove-duplicates-from-sorted-list';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    head: number[],
  },
  output: number[],
  message: string,
}

describe(
    'RemoveDuplicatesFromSortedList',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach((sample: Sample) => {
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
