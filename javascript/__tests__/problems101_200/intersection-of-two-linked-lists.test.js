import SOLUTIONS from '../../src/problems101_200/intersection-of-two-linked-lists';
import getSamples from '../../../testing/js/src/sample/samples';
import SinglyListNode from '../../src/concepts/singly-list-node';
import {notStrictEqual, strictEqual} from 'assert';

describe(
    'IntersectionOfTwoLinkedLists',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution => {
                  for (const sample of getSamples()) {
                    const listA = SinglyListNode.of(...sample.input.listA);
                    const listB = SinglyListNode.of(...sample.input.listB);
                    if (sample.input.intersectVal < 1) {
                      strictEqual(
                          solution.getIntersectionNode(listA, listB),
                          undefined,
                          sample.message,
                      );
                      continue;
                    }
                    listA.iterateTo(sample.input.skipA - 1).next =
                        listB.iterateTo(sample.input.skipB - 1);
                    notStrictEqual(
                        solution.getIntersectionNode(listA, listB),
                        undefined,
                        sample.message,
                    );
                  }
                }),
        ),
);
