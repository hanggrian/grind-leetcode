from unittest import main

from src.problems101_200.lru_cache import LruCache
from tests.sample.sampled_test import SampledTest


class TestLruCache(SampledTest):
    def test(self):
        for sample in self.get_samples():
            cache = None
            for i, move_name in enumerate(sample['input']['moveNames']):
                values = sample['input']['moveValues'][i]
                match move_name:
                    case 'LRUCache':
                        cache = LruCache(values[0])
                        self.assertIsNone(sample['output'][i])
                        break
                    case 'put':
                        cache.set(values[0], values[1])
                        self.assertIsNone(sample['output'][i])
                        break
                    case 'get':
                        self.assertEqual(
                            sample['output'][i],
                            cache.get(values[0]),
                        )
                        break


if __name__ == '__main__':
    main()
