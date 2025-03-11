class Problem {
  hasCycle(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class RememberVisits extends Problem {
  hasCycle(head) {
    // visited nodes
    const visits = new Set();
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
  hasCycle(head) {
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

const SOLUTIONS = [new RememberVisits(), new FastFlowPointer()];
export default SOLUTIONS;
