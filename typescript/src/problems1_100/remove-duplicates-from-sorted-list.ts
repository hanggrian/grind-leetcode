import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  deleteDuplicates(head: SinglyListNode | undefined): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  deleteDuplicates(head: SinglyListNode | undefined): SinglyListNode | undefined {
    let current: SinglyListNode | undefined = head;
    while (current && current.next) {
      if (current.val == current.next.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return head;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
