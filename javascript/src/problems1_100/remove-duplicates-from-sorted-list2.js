import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  deleteDuplicates(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  deleteDuplicates(head) {
    const root = new SinglyListNode(-101, head);
    let previous = root;
    let current = head;
    while (current) {
      if (current.next && current.value === current.next.value) {
        while (current.next && current.value === current.next.value) {
          current = current.next;
        }
        previous.next = current.next;
      } else {
        previous = previous.next;
      }
      current = current.next;
    }
    return root.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
