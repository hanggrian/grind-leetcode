import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/search-insert-position';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'SearchInsertPosition',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.searchInsert(
                                sample.input.nums,
                                sample.input.target,
                            ),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
