import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  removeNthFromEnd(head: SinglyListNode, n: number): SinglyListNode {
    throw new Error(`Not implemented (${head}, ${n}).`);
  }
}

class Default extends Problem {
  removeNthFromEnd(head: SinglyListNode, n: number): SinglyListNode {
    if (!head.next && n === 1) {
      return undefined;
    }
    const root = new SinglyListNode(0, head);
    let left = root;
    let right = root;
    for (let i = 0; i < n; i++) {
      left = left.next;
    }
    while (left.next) {
      left = left.next;
      right = right.next;
    }
    right.next = right.next.next;
    return root.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
