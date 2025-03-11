from unittest import TestCase, main

from src.problems101_200.lru_cache import LruCache


class TestLruCache(TestCase):
    def test(self):
        cache = LruCache(2)
        cache.put(1, 1)
        cache.put(2, 2)
        self.assertDictEqual({1: 1, 2: 2}, cache.cache)
        self.assertEqual(1, cache.get(1))

        cache.put(3, 3)
        self.assertDictEqual({1: 1, 3: 3}, cache.cache)
        self.assertEqual(-1, cache.get(2))

        cache.put(4, 4)
        self.assertDictEqual({3: 3, 4: 4}, cache.cache)
        self.assertEqual(-1, cache.get(1))
        self.assertEqual(3, cache.get(3))
        self.assertEqual(4, cache.get(4))


if __name__ == '__main__':
    main()
