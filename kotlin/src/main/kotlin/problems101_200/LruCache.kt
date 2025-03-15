package problems101_200

class LruCache(val capacity: Int) {
    val cache = linkedMapOf<Int, Int>()

    operator fun get(key: Int): Int {
        if (!cache.containsKey(key)) {
            return -1
        }
        val value = cache.remove(key)!!
        cache[key] = value // put on end
        return value
    }

    operator fun set(key: Int, value: Int) {
        if (cache.containsKey(key)) {
            cache -= key
        } else if (cache.size == capacity) {
            cache -= cache.keys.iterator().next()
        }
        cache[key] = value
    }
}
