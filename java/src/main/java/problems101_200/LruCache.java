package problems101_200;

import java.util.LinkedHashMap;
import java.util.Map;

class LruCache {
    int capacity;
    Map<Integer, Integer> cache = new LinkedHashMap<>();

    LruCache(int capacity) {
        this.capacity = capacity;
    }

    int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        int value = cache.remove(key);
        cache.put(key, value); // put on end
        return value;
    }

    void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.remove(key);
        } else if (cache.size() == capacity) {
            cache.remove(cache.keySet().iterator().next());
        }
        cache.put(key, value);
    }
}
