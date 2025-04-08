class Problem {
  deleteNode(node) {
    throw new Error(`Not implemented (${node}).`);
  }
}

class Default extends Problem {
  deleteNode(node) {
    if (!node) {
      return;
    }
    const next = node.next;
    node.val = next.val;
    node.next = next.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
