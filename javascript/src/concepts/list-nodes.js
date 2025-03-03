class ListNode {
  constructor(value) {
    this.value = value;
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

export class SinglyListNode extends ListNode {
  constructor(value = 0, next = undefined) {
    super(value);
    this.next = next;
  }

  static of(...values) {
    if (values.length === 0) {
      return undefined;
    }
    let head = new SinglyListNode(values[0]);
    let current = head;
    for (let i = 1; i < values.length; i++) {
      current.next = new SinglyListNode(values[i]);
      current = current.next;
    }
    return head;
  }
}

export class DoublyListNode extends ListNode {
  constructor(value = 0, next = undefined, prev = undefined) {
    super(value);
    this.next = next;
    this.prev = prev;
  }
}

export const SINGLY_LIST_NODE_ZERO = new SinglyListNode(0);
