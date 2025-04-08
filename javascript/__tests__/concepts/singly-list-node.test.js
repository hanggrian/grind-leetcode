import {strictEqual} from 'assert';
import SinglyListNode, {SINGLY_LIST_NODE_ZERO} from '../../src/concepts/singly-list-node';

describe(
    'SinglyListNode',
    () => {
      test(
          'sum',
          () => {
            let total = 0;
            for (const n of SINGLY_LIST_NODE_ZERO) {
              total += n.val;
            }
            strictEqual(0, total);

            total = 0;
            for (const n of SinglyListNode.of(1, 3, 5, 7)) {
              total += n.val;
            }
            strictEqual(16, total);
          },
      );
      test(
          'traverse',
          () => {
            let node = SinglyListNode.of(2, 4, 6, 8);
            strictEqual(2, node.val);

            node = node.next.next;
            strictEqual(6, node.val);

            node = node.next;
            strictEqual(8, node.val);
          },
      );
    },
);
