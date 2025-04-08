import ListNode from './list-node';

export default class SinglyListNode extends ListNode {
  next: SinglyListNode | undefined;

  constructor(val: number = 0, next: SinglyListNode | undefined = undefined) {
    super(val);
    this.next = next;
  }

  static of(...vals: number[]): SinglyListNode | undefined {
    if (vals.length === 0) {
      return undefined;
    }
    const head: SinglyListNode = new SinglyListNode(vals[0]);
    let current: SinglyListNode = head;
    for (let i = 1; i < vals.length; i++) {
      current.next = new SinglyListNode(vals[i]);
      current = current.next;
    }
    return head;
  }
}

export const SINGLY_LIST_NODE_ZERO = new SinglyListNode(0);
