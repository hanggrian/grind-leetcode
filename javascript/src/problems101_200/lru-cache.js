export default class LruCache {
  capacity = 0;
  cache = new Map();

  constructor(capacity) {
    this.capacity = capacity;
  }

  get(key) {
    if (!this.cache.has(key)) {
      return -1;
    }
    const value = this.cache.get(key);
    this.cache.delete(key);
    this.cache.set(key, value); // put on end
    return value;
  }

  put(key, value) {
    console.log(this.cache.size + ' ' + this.capacity);
    if (this.cache.has(key)) {
      this.cache.delete(key);
    } else if (this.cache.size === this.capacity) {
      this.cache.delete(this.cache.keys().next().value);
    }
    this.cache.set(key, value);
  }
}
