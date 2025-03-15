import TreeNode from '../concepts/tree-node';

class Problem {
  invertTree(root: TreeNode | undefined): TreeNode | undefined {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  invertTree(root: TreeNode | undefined): TreeNode | undefined {
    if (!root) {
      return undefined;
    }
    let temp = root.left;
    root.left = this.invertTree(root.right);
    root.right = this.invertTree(temp);
    return root;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
