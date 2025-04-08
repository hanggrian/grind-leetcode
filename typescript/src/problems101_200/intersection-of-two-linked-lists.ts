import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  getIntersectionNode(
      headA: SinglyListNode | undefined,
      headB: SinglyListNode | undefined,
  ): SinglyListNode | undefined {
    throw new Error(`Not implemented (${headA}, ${headB}).`);
  }
}

class Default extends Problem {
  getIntersectionNode(
      headA: SinglyListNode | undefined,
      headB: SinglyListNode | undefined,
  ): SinglyListNode | undefined {
    let nodeA: SinglyListNode | undefined = headA;
    let nodeB: SinglyListNode | undefined = headB;
    while (nodeA !== nodeB) {
      nodeA = nodeA ? nodeA.next : headB;
      nodeB = nodeB ? nodeB.next : headA;
    }
    return nodeA;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
