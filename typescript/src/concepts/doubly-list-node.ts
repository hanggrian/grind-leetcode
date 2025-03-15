import ListNode from './list-node';

export default class DoublyListNode extends ListNode {
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
