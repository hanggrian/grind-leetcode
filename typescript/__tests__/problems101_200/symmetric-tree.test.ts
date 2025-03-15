import {deepEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';
import SOLUTIONS from '../../src/problems101_200/symmetric-tree';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    root: number[],
  },
  output: boolean,
  message: string,
}

describe(
    'SymmetricTree',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.isSymmetric(TreeNode.of(...sample.input.root)),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
