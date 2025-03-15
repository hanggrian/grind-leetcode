import {deepEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';
import SOLUTIONS from '../../src/problems101_200/maximum-depth-of-binary-tree';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'MaximumDepthOfBinaryTree',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.maxDepth(TreeNode.of(...sample.input.root)),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
