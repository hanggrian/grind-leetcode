import ListNode from './list-node';

export default class SinglyListNode extends ListNode {
  constructor(val = 0, next = undefined) {
    super(val);
    this.next = next;
  }

  static of(...vals) {
    if (vals.length === 0) {
      return undefined;
    }
    const head = new SinglyListNode(vals[0]);
    let current = head;
    for (let i = 1; i < vals.length; i++) {
      current.next = new SinglyListNode(vals[i]);
      current = current.next;
    }
    return head;
  }
}

export const SINGLY_LIST_NODE_ZERO = new SinglyListNode(0);
