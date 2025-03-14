import Node from './node';

export default class ListNode extends Node {
  constructor(value) {
    super(value);
    this.next = undefined;
  }

  hasNext() {
    return this.next !== undefined;
  }

  iterateTo(position) {
    let node = this;
    for (let i = 0; i < position; i++) {
      node = node.next;
    }
    return node;
  }

  iterateLast() {
    let node = this;
    while (node.hasNext()) {
      node = node.next;
    }
    return node;
  }

  [Symbol.iterator]() {
    let node = this;
    return {
      next: () => {
        if (!node) {
          return {value: undefined, done: true};
        }
        const value = node;
        node = node.next;
        return {value, done: false};
      }
    };
  }

  equals(other) {
    if (this === other) {
      return true;
    }
    if (!(other instanceof ListNode)) {
      return false;
    }
    let node1 = this;
    let node2 = other;
    while (node1 && node2) {
      if (node1.value !== node2.value) {
        return false;
      }
      node1 = node1.next;
      node2 = node2.next;
    }
    return !node1 && !node2;
  }
}
