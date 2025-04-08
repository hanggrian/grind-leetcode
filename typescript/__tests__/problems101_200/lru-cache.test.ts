import {strictEqual} from 'assert';
import getSamples from '../../../testing/js/src/sample/samples';
import LruCache from '../../src/problems101_200/lru-cache';

type Sample = {
  input: {
    moveNames: string[],
    moveValues: number[][],
  },
  output: number[],
  message: string,
}

describe(
    'LruCache',
    () =>
        test(
            'test',
            () =>
                getSamples().forEach((sample: Sample) => {
                  let cache = undefined;
                  for (let i = 0; i < sample.input.moveNames.length; i++) {
                    const values = sample.input.moveValues[i];
                    switch (sample.input.moveNames[i]) {
                      case 'LRUCache':
                        cache = new LruCache(values[0]);
                        strictEqual(null, sample.output[i]);
                        break;
                      case 'put':
                        cache.set(values[0], values[1]);
                        strictEqual(null, sample.output[i]);
                        break;
                      case 'get':
                        strictEqual(cache.get(values[0]), sample.output[i]);
                        break;
                    }
                  }
                }),
        ),
);
