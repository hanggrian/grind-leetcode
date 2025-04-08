import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  removeNthFromEnd(head: SinglyListNode | undefined, n: number): SinglyListNode | undefined {
    throw new Error(`Not implemented (${head}, ${n}).`);
  }
}

class Default extends Problem {
  removeNthFromEnd(head: SinglyListNode | undefined, n: number): SinglyListNode | undefined {
    if (!head.next && n === 1) {
      return undefined;
    }
    const root: SinglyListNode = new SinglyListNode(0, head);
    let left: SinglyListNode = root;
    let right: SinglyListNode = root;
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
