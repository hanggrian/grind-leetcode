import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/count-complete-tree-nodes';
import getSamples from '../../../testing/js/src/sample/samples';
import TreeNode from '../../src/concepts/tree-node';

type Sample = {
  input: {
    root: number[],
  },
  output: number,
  message: string,
}

describe(
    'CountCompleteTreeNodes',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.countNodes(TreeNode.of(...sample.input.root)),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
