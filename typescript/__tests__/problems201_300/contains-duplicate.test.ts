import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems201_300/contains-duplicate';
import getSamples from '../../../testing/js/src/sample/samples';

type Sample = {
  input: {
    nums: number[],
  },
  output: boolean,
  message: string,
}

describe(
    'ContainsDuplicate',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach((sample: Sample) =>
                        strictEqual(
                            solution.containsDuplicate(sample.input.nums),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
