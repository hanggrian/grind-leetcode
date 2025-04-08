import {deepEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/remove-linked-list-elements';
import getSamples from '../../../testing/js/src/sample/samples';
import SinglyListNode from '../../src/concepts/singly-list-node';

type Sample = {
  input: {
    head: number[],
    k: number,
  },
  output: number[],
  message: string,
}

describe(
    'RemoveLinkedListElements',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        deepEqual(
                            solution.removeElements(
                                SinglyListNode.of(...sample.input.head),
                                sample.input.k,
                            ),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        )
                    ),
                ),
        ),
);
