import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  deleteDuplicates(head: SinglyListNode): SinglyListNode {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  deleteDuplicates(head: SinglyListNode): SinglyListNode {
    let current = head;
    while (current != null && current.next != null) {
      if (current.value == current.next.value) {
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
