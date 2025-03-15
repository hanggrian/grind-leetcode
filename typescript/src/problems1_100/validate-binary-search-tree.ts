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
    if (left && node.value <= left) {
      return false;
    }
    if (right && node.value >= right) {
      return false;
    }
    return this.recursiveValid(node.left, left, node.value) &&
        this.recursiveValid(node.right, node.value, right);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
