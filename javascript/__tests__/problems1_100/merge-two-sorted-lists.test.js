import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import {SOLUTIONS} from '../../src/problems1_100/merge-two-sorted-lists';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MergeTwoSortedLists',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                deepEqual(
                    SinglyListNode.of(...sample.output),
                    solution.mergeTwoLists(
                        SinglyListNode.of(...sample.input.list1),
                        SinglyListNode.of(...sample.input.list2),
                    ),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
