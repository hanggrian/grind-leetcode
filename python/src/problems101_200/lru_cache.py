class LruCache:
    def __init__(self, capacity: int):
        self.capacity: int = capacity
        self.cache: dict[int, int] = {}

    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1
        value: int = self.cache.pop(key)
        self.cache[key] = value  # put on end
        return value

    def set(self, key: int, value: int):
        if key in self.cache:
            self.cache.pop(key)
        elif len(self.cache) == self.capacity:
            self.cache.pop(next(iter(self.cache)))
        self.cache[key] = value
