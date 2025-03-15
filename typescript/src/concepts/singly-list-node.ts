import ListNode from './list-node';

export default class SinglyListNode extends ListNode {
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

export const SINGLY_LIST_NODE_ZERO = new SinglyListNode(0);
