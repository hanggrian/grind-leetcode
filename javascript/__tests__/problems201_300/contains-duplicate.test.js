import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/contains-duplicate';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ContainsDuplicate',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.containsDuplicate(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
