import {strictEqual} from 'assert';
import TreeNode from '../../src/concepts/tree-node';
import SOLUTIONS from '../../src/problems1_100/same-tree';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    p: number[],
    q: number[],
  },
  output: boolean,
  message: string,
}

describe(
    'SameTree',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.isSameTree(
                                TreeNode.of(...sample.input.q),
                                TreeNode.of(...sample.input.p),
                            ),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
