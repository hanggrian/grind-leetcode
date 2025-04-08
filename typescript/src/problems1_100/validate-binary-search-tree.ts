import TreeNode from '../concepts/tree-node';

class Problem {
  isValidBst(root: TreeNode | undefined): boolean {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  isValidBst(root: TreeNode | undefined): boolean {
    return this.recursiveValid(root, undefined, undefined);
  }

  recursiveValid(
      node: TreeNode | undefined,
      left: number | undefined,
      right: number | undefined,
  ): boolean {
    if (!node) {
      return true;
    }
    if (left && node.val <= left) {
      return false;
    }
    if (right && node.val >= right) {
      return false;
    }
    return this.recursiveValid(node.left, left, node.val) &&
        this.recursiveValid(node.right, node.val, right);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
