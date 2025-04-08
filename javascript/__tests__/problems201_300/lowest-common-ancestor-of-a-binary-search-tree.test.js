import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/lowest-common-ancestor-of-a-binary-search-tree';
import getSamples from '../../../testing/js/src/sample/samples';
import TreeNode from '../../src/concepts/tree-node';

describe(
    'LowestCommonAncestorOfABinarySearchTree',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.lowestCommonAncestor(
                                TreeNode.of(...sample.input.root),
                                new TreeNode(sample.input.p),
                                new TreeNode(sample.input.q),
                            ).val,
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
