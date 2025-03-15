import {deepEqual} from 'assert';
import SinglyListNode from '../../src/concepts/singly-list-node';
import SOLUTIONS from '../../src/problems1_100/rotate-list';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RotateList',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        deepEqual(
                            solution.rotateRight(
                                SinglyListNode.of(...sample.input.head),
                                sample.input.k,
                            ),
                            SinglyListNode.of(...sample.output),
                            sample.message,
                        ),
                    ),
                ),
        ),
);
