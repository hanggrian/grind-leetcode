import SinglyListNode from '../../src/concepts/singly-list-node';

class Problem {
  hasCycle(head: SinglyListNode | undefined): boolean {
    throw new Error(`Not implemented (${head}).`);
  }
}

class RememberVisits extends Problem {
  hasCycle(head: SinglyListNode | undefined): boolean {
    // visited nodes
    const visits: Set<SinglyListNode> = new Set();
    for (const node of head) {
      if (visits.has(node)) {
        return true;
      }
      visits.add(node);
    }
    return false;
  }
}

class FastFlowPointer extends Problem {
  hasCycle(head: SinglyListNode | undefined): boolean {
    if (!head || !head.hasNext()) {
      return false;
    }
    let slow: SinglyListNode = head.next;
    let fast: SinglyListNode | undefined = head.next.next;
    while (fast && fast.hasNext() && slow !== fast) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow === fast;
  }
}

const SOLUTIONS = [new RememberVisits(), new FastFlowPointer()];
export default SOLUTIONS;
