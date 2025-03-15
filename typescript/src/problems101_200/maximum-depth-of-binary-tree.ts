import TreeNode from '../concepts/tree-node';

class Problem {
  maxDepth(root: TreeNode | undefined): number {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  maxDepth(root: TreeNode | undefined): number {
    return this.recursiveMaxDepth(root, 0);
  }

  recursiveMaxDepth(node: TreeNode | undefined, depth: number): number {
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
