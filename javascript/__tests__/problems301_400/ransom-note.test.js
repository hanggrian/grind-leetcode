import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems301_400/ransom-note';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'RansomNote',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.canConstruct(sample.input.ransomNote, sample.input.magazine),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
