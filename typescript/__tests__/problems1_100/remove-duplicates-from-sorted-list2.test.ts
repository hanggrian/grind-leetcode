import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems1_100/remove-duplicates-from-sorted-list2';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    head: number[],
  },
  output: number[],
  message: string,
}

describe(
    'RemoveDuplicatesFromSortedList2',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples('remove-duplicates-from-sorted-list-ii.json')
                        .forEach((sample: Sample) =>
                            deepEqual(
                                solution.deleteDuplicates(SinglyListNode.of(...sample.input.head)),
                                SinglyListNode.of(...sample.output),
                                sample.message,
                            ),
                        ),
                ),
        ),
);
