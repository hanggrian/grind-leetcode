import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/palindrome-number';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'PalindromeNumber',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.isPalindrome(sample.input.x),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
