import TreeNode from '../concepts/tree-node';

class Problem {
  isSameTree(p: TreeNode | undefined, q: TreeNode | undefined): boolean {
    throw new Error(`Not implemented (${p}, ${q}).`);
  }
}

class Default extends Problem {
  isSameTree(p: TreeNode | undefined, q: TreeNode | undefined): boolean {
    if (!p && !q) {
      return true;
    }
    if (!p || !q) {
      return false;
    }
    if (p.val !== q.val) {
      return false;
    }
    return this.isSameTree(p.left, q.left)
        && this.isSameTree(p.right, q.right);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
