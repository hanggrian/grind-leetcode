import ListNode from './list-node';

export default class DoublyListNode extends ListNode {
  next: DoublyListNode | undefined;
  prev: DoublyListNode | undefined;

  constructor(
      val: number = 0,
      next: DoublyListNode | undefined = undefined,
      prev: DoublyListNode | undefined = undefined
  ) {
    super(val);
    this.next = next;
    this.prev = prev;
  }
}
