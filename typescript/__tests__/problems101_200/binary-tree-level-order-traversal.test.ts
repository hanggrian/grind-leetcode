import {deepEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';
import SOLUTIONS from '../../src/problems101_200/binary-tree-level-order-traversal';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    root: number[],
  },
  output: number[][],
  message: string,
}

describe(
    'BinaryTreeLevelOrderTraversal',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.levelOrder(TreeNode.of(...sample.input.root)),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
