import TreeNode from "../concepts/tree-node";

class Problem {
  lowestCommonAncestor(
      root: TreeNode | undefined,
      p: TreeNode | undefined,
      q: TreeNode | undefined,
  ): TreeNode | undefined {
    throw new Error(`Not implemented (${root}, ${p}, ${q}).`);
  }
}

class Default extends Problem {
  lowestCommonAncestor(
      root: TreeNode | undefined,
      p: TreeNode | undefined,
      q: TreeNode | undefined,
  ): TreeNode | undefined {
    if (!p || !q) {
      return undefined;
    }
    let current: TreeNode | undefined = root;
    while (current) {
      if (current.val > p.val && current.val > q.val) {
        current = current.left;
      } else if (current.val < p.val && current.val < q.val) {
        current = current.right;
      } else {
        break;
      }
    }
    return current;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
