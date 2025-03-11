import {deepEqual, strictEqual} from 'assert';
import LruCache from '../../src/problems101_200/lru-cache';

describe(
    'LruCache',
    () => {
      test(
          'test',
          () => {
            const cache = new LruCache(2);
            cache.put(1, 1);
            cache.put(2, 2);
            deepEqual(Object.fromEntries(cache.cache), {'1': 1, '2': 2});
            strictEqual(cache.get(1), 1);

            cache.put(3, 3);
            deepEqual(Object.fromEntries(cache.cache), {'1': 1, '3': 3});
            strictEqual(cache.get(2), -1);

            cache.put(4, 4);
            deepEqual(Object.fromEntries(cache.cache), {'3': 3, '4': 4});
            strictEqual(cache.get(1), -1);
            strictEqual(cache.get(3), 3);
            strictEqual(cache.get(4), 4);
          },
      );
    },
);
