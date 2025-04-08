import {strictEqual} from 'assert';
import FirstBadVersion from '../../src/problems201_300/first-bad-version';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'FirstBadVersion',
    () =>
        test(
            'test',
            () =>
                getSamples().forEach(sample =>
                    strictEqual(
                        new FirstBadVersion(sample.input.bad).firstBadVersion(sample.input.n),
                        sample.output,
                        sample.message,
                    ),
                ),
        ),
);
