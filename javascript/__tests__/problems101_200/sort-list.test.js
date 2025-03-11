import {deepEqual} from 'assert';
import {SinglyListNode} from '../../src/concepts/list-nodes';
import SOLUTIONS from '../../src/problems101_200/sort-list';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SortList',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution => {
                getSamples().forEach(sample => {
                  deepEqual(
                      solution.sortList(SinglyListNode.of(...sample.input.head)),
                      SinglyListNode.of(...sample.output),
                      sample.message,
                  );
                });
              }),
      );
    },
);
