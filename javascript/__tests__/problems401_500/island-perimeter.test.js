import {strictEqual} from 'assert';
import SOLUTIONS from '../../src/problems401_500/island-perimeter';
import getSamples from '../../../testing/js/src/sample/samples';

describe(
    'IslandPerimeter',
    () =>
        test(
            'test',
            () =>
                SOLUTIONS.forEach(solution =>
                    getSamples().forEach(sample =>
                        strictEqual(
                            solution.islandPerimeter(sample.input.grid),
                            sample.output,
                            sample.message,
                        ),
                    ),
                ),
        ),
);
