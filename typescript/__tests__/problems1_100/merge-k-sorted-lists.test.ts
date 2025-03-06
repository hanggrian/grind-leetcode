import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import {SOLUTIONS} from '../../src/problems1_100/merge-k-sorted-lists';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MergeKSortedLists',
    () => {
      test(
          'test',
          () => {
            for (let solution of SOLUTIONS) {
              for (let sample of getSamples()) {
                deepEqual(
                    SinglyListNode.of(...sample.output),
                    solution.mergeKLists(
                        sample.input.lists.map(list => SinglyListNode.of(...list)),
                    ),
                    sample.explanation,
                );
              }
            }
          },
      );
    },
);
