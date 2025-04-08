import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  deleteDuplicates(head: SinglyListNode | undefined): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  deleteDuplicates(head: SinglyListNode | undefined): SinglyListNode | undefined {
    const root: SinglyListNode = new SinglyListNode(-101, head);
    let previous: SinglyListNode = root;
    let current: SinglyListNode | undefined = head;
    while (current) {
      if (current.next && current.val === current.next.val) {
        while (current.next && current.val === current.next.val) {
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
