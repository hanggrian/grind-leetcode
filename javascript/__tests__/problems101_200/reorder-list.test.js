import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems101_200/reorder-list';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ReorderList',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample => {
                      const inp = SinglyListNode.of(...sample.input.head);
                      solution.reorderList(inp);
                      deepEqual(
                          inp,
                          SinglyListNode.of(...sample.output),
                          sample.message,
                      );
                    }),
                ),
        ),
);
