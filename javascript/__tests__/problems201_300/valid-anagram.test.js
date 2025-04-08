import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/valid-anagram';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ValidAnagram',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.isAnagram(sample.input.s, sample.input.t),
                            sample.output,
                            sample.message,
                        )
                    ),
                ),
        ),
);
