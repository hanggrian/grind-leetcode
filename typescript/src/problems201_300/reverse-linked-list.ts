import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  reverseList(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  reverseList(head) {
    let previous: SinglyListNode | undefined = undefined;
    let current: SinglyListNode | undefined = head;
    while (current) {
      const next: SinglyListNode | undefined = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
