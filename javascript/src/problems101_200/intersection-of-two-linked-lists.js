class Problem {
  getIntersectionNode(headA, headB) {
    throw new Error(`Not implemented (${headA}, ${headB}).`);
  }
}

class Default extends Problem {
  getIntersectionNode(headA, headB) {
    let nodeA = headA;
    let nodeB = headB;
    while (nodeA !== nodeB) {
      nodeA = nodeA ? nodeA.next : headB;
      nodeB = nodeB ? nodeB.next : headA;
    }
    return nodeA;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
