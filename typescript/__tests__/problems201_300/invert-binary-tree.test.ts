import {deepEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';
import SOLUTIONS from '../../src/problems201_300/invert-binary-tree';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    root: number[],
  },
  output: number[],
  message: string,
}

describe(
    'InvertBinaryTree',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.invertTree(TreeNode.of(...sample.input.root)),
                            TreeNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
