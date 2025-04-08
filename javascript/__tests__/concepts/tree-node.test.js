import {strictEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';

describe(
    'TreeNode',
    () =>
      test(
          'traverse',
          () => {
            let node = TreeNode.of(1, 2, 3, 4, 5, 6, 7);
            strictEqual(1, node.val);

            let left = node.left;
            strictEqual(2, left.val);

            left = left.left;
            strictEqual(4, left.val);

            let right = node.right;
            strictEqual(3, right.val);

            right = right.right;
            strictEqual(7, right.val);
          },
      ),
);
