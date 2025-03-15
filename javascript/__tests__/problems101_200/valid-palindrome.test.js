import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems101_200/valid-palindrome';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'ValidPalindrome',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.isPalindrome(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
