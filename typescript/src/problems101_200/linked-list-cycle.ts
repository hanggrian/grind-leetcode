import {SinglyListNode} from '../../src/concepts/list-nodes';

class Problem {
  hasCycle(head: SinglyListNode): boolean {
    throw new Error(`'Not implemented (${head}).`);
  }
}

class RememberVisits extends Problem {
  hasCycle(head: SinglyListNode): boolean {
    // visited nodes
    let visits = new Set();
    for (let node of head) {
      if (visits.has(node)) {
        return true;
      }
      visits.add(node);
    }
    return false;
  }
}

class FastFlowPointer extends Problem {
  hasCycle(head: SinglyListNode): boolean {
    if (!head || !head.hasNext()) {
      return false;
    }
    let slow = head.next;
    let fast = head.next.next;
    while (fast && fast.hasNext() && slow !== fast) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow === fast;
  }
}

export const SOLUTIONS = [new RememberVisits(), new FastFlowPointer()];
