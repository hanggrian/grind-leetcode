import {deepEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';
import SOLUTIONS from '../../src/problems101_200/construct-binary-tree-from-preorder-and-inorder-traversal';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ConstructBinaryTreeFromPreorderAndInorderTraversal',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.buildTree(sample.input.preorder, sample.input.inorder),
                            TreeNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
