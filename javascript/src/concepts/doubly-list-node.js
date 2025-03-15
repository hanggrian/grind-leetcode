import ListNode from './list-node';

export default class DoublyListNode extends ListNode {
  constructor(value = 0, next = undefined, prev = undefined) {
    super(value);
    this.next = next;
    this.prev = prev;
  }
}
