import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems101_200/reorder-list';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    head: number[],
  },
  output: number[],
  message: string,
}

describe(
    'ReorderList',
    () => {
      test(
          'test',
          () =>
              SOLUTIONS.forEach(solution =>
                  getSamples().forEach((sample: Sample) => {
                    const inp = SinglyListNode.of(...sample.input.head);
                    solution.reorderList(inp);
                    deepEqual(
                        inp,
                        SinglyListNode.of(...sample.output),
                        sample.message,
                    );
                  }),
              ),
      );
    },
);
