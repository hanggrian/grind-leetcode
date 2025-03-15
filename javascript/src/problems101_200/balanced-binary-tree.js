class Problem {
  isBalanced(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  isBalanced(root) {
    if (!root) {
      return true;
    }
    if (Math.abs(this.maxDepth(root.left, 1) - this.maxDepth(root.right, 1)) > 1) {
      return false;
    }
    return this.isBalanced(root.left) && this.isBalanced(root.right);
  }

  maxDepth(node, depth) {
    if (!node) {
      return depth;
    }
    const leftDepth = this.maxDepth(node.left, depth + 1);
    const rightDepth = this.maxDepth(node.right, depth + 1);
    return Math.max(leftDepth, rightDepth);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
