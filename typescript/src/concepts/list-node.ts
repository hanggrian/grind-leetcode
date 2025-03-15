import Node from './node';

export default class ListNode extends Node {
  next: ListNode | undefined;

  constructor(value: number) {
    super(value);
    this.next = undefined;
  }

  hasNext(): boolean {
    return this.next !== undefined;
  }

  iterateTo(position: number): ListNode {
    let node: ListNode = this;
    for (let i = 0; i < position; i++) {
      node = node.next!;
    }
    return node;
  }

  iterateLast(): ListNode {
    let node: ListNode = this;
    while (node.hasNext()) {
      node = node.next!;
    }
    return node;
  }

  [Symbol.iterator](): Iterator<ListNode> {
    let node: ListNode = this;
    return {
      next: () => {
        if (!node) {
          return {value: undefined, done: true};
        }
        const value: ListNode = node;
        node = node.next;
        return {value, done: false};
      },
    };
  }

  equals(other: ListNode): boolean {
    if (this === other) {
      return true;
    }
    if (!(other instanceof ListNode)) {
      return false;
    }
    let node1: ListNode | undefined = this;
    let node2: ListNode | undefined = other;
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
