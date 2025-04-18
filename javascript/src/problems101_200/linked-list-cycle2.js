class Problem {
  detectCycle(head) {
    throw new Error(`Not implemented (${head}).`);
  }
}

class RememberVisits extends Problem {
  detectCycle(head) {
    // visited nodes
    const visits = new Set();
    let current = head;
    for (const node of head) {
      if (visits.has(node)) {
        return current;
      }
      visits.add(node);
      current = current.next;
    }
    return current;
  }
}

class FastFlowPointer extends Problem {
  detectCycle(head) {
    if (!head || !head.next) {
      return undefined;
    }
    let slow = head.next;
    let fast = head.next.next;
    while (fast && fast.next) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow === fast) {
        break;
      }
    }

    if (!slow || !slow.next) {
      return undefined;
    }
    let left = head;
    let right = slow;
    while (left !== right) {
      left = left.next;
      right = right.next;
    }
    return left;
  }
}

const SOLUTIONS = [new RememberVisits(), new FastFlowPointer()];
export default SOLUTIONS;
