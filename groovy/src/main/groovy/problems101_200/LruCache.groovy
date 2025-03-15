package problems101_200

class LruCache {
    int capacity
    LinkedHashMap<Integer, Integer> cache = [:]

    LruCache(int capacity) {
        this.capacity = capacity
    }

    int get(int key) {
        if (!cache.containsKey(key)) {
            return -1
        }
        int value = cache.remove(key)
        cache.put(key, value) // put on end
        return value
    }

    void set(int key, int value) {
        if (cache.containsKey(key)) {
            cache.remove(key)
        } else if (cache.size() == capacity) {
            cache.remove(cache.keySet().iterator().next())
        }
        cache.put(key, value)
    }
}
