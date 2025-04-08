import TreeNode from '../concepts/tree-node';

class Problem {
  rightSideView(root: TreeNode | undefined): number[] {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  rightSideView(root: TreeNode | undefined): number[] {
    const result: number[] = [];
    this.dfs(root, result, 0);
    return result;
  }

  dfs(node: TreeNode | undefined, list: number[], level: number) {
    if (!node) {
      return;
    }
    if (level === list.length) {
      list.push(node.val);
    }
    this.dfs(node.right, list, level + 1);
    this.dfs(node.left, list, level + 1);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
