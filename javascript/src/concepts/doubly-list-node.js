import ListNode from './list-node';

export default class DoublyListNode extends ListNode {
  constructor(val = 0, next = undefined, prev = undefined) {
    super(val);
    this.next = next;
    this.prev = prev;
  }
}
