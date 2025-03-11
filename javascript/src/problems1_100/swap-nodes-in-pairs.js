import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  swapPairs(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class Default extends Problem {
  swapPairs(head) {
    const root = new SinglyListNode(0, head);
    let current = root;
    while (current.next && current.next.next) {
      const node1 = current.next;
      const node2 = current.next.next;
      node1.next = node2.next;
      current.next = node2;
      current.next.next = node1;
      current = current.next.next;
    }
    return root.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
