import TreeNode from '../concepts/tree-node';

class Problem {
  buildTree(preorder: number[], inorder: number[]): TreeNode | undefined {
    throw new Error(`Not implemented (${preorder}, ${inorder}).`);
  }
}

class Default extends Problem {
  buildTree(preorder: number[], inorder: number[]): TreeNode | undefined {
    if (preorder.length === 0 || inorder.length === 0) {
      return undefined;
    }
    const root: TreeNode = new TreeNode(preorder[0]);
    let mid: number = -1;
    for (let i = 0; i < inorder.length; i++) {
      if (inorder[i] !== preorder[0]) {
        continue;
      }
      mid = i;
      break;
    }
    root.left =
        this.buildTree(
            preorder.slice(1, mid + 1),
            inorder.slice(0, mid)
        );
    root.right =
        this.buildTree(
            preorder.slice(mid + 1, preorder.length),
            inorder.slice(mid + 1, inorder.length)
        );
    return root;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
