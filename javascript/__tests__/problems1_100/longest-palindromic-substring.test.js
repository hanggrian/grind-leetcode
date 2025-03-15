import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems1_100/longest-palindromic-substring';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'LongestPalindromicSubstring',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.longestPalindrome(sample.input.s),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
