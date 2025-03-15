import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems1_100/merge-k-sorted-lists';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MergeKSortedLists',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.mergeKLists(
                                sample.input.lists.map(list => SinglyListNode.of(...list)),
                            ),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
