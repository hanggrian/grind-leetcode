class ListNode {
  value: number;
  next: ListNode | undefined;

  constructor(value: number) {
    this.value = value;
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

export class SinglyListNode extends ListNode {
  next: SinglyListNode | undefined;

  constructor(value: number = 0, next: SinglyListNode | undefined = undefined) {
    super(value);
    this.next = next;
  }

  static of(...values: number[]): SinglyListNode | undefined {
    if (values.length === 0) {
      return undefined;
    }
    let head: SinglyListNode = new SinglyListNode(values[0]);
    let current: SinglyListNode = head;
    for (let i = 1; i < values.length; i++) {
      current.next = new SinglyListNode(values[i]);
      current = current.next;
    }
    return head;
  }
}

export class DoublyListNode extends ListNode {
  next: DoublyListNode | undefined;
  prev: DoublyListNode | undefined;

  constructor(
      value: number = 0,
      next: DoublyListNode | undefined = undefined,
      prev: DoublyListNode | undefined = undefined
  ) {
    super(value);
    this.next = next;
    this.prev = prev;
  }
}

export const SINGLY_LIST_NODE_ZERO = new SinglyListNode(0);
