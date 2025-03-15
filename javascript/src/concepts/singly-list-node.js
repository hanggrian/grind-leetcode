import ListNode from './list-node';

export default class SinglyListNode extends ListNode {
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

export const SINGLY_LIST_NODE_ZERO = new SinglyListNode(0);
