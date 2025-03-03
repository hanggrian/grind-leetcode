import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  swapPairs(head: SinglyListNode): SinglyListNode {
    throw new Error(`'Not implemented (${head}).`);
  }
}

class Default extends Problem {
  swapPairs(head: SinglyListNode): SinglyListNode {
    let root = new SinglyListNode(0);
    root.next = head;
    let current = root;
    while (current.next && current.next.next) {
      let node1 = current.next;
      let node2 = current.next.next;
      node1.next = node2.next;
      current.next = node2;
      current.next.next = node1;
      current = current.next.next;
    }
    return root.next;
  }
}

export const SOLUTIONS = [new Default()];
