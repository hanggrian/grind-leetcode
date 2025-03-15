class Problem {
  maxDepth(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  maxDepth(root) {
    return this.recursiveMaxDepth(root, 0);
  }

  recursiveMaxDepth(node, depth) {
    if (!node) {
      return depth;
    }
    const leftDepth = this.recursiveMaxDepth(node.left, depth + 1);
    const rightDepth = this.recursiveMaxDepth(node.right, depth + 1);
    return Math.max(leftDepth, rightDepth);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
