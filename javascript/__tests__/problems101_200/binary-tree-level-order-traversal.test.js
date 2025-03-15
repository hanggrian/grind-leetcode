import {deepEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';
import SOLUTIONS from '../../src/problems101_200/binary-tree-level-order-traversal';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'BinaryTreeLevelOrderTraversal',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.levelOrder(TreeNode.of(...sample.input.root)),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
