import TreeNode from '../concepts/tree-node';

class Problem {
  binaryTreePaths(root: TreeNode | undefined): string[] {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  binaryTreePaths(root: TreeNode | undefined): string[] {
    const paths = [];
    this.dfs(root, paths, '');
    return paths;
  }

  dfs(node: TreeNode | undefined, paths: string[], path: string) {
    if (!node) {
      return;
    }
    if (!node.left && !node.right) {
      paths.push(`${path}${node.val}`);
    }
    if (node.left) {
      this.dfs(node.left, paths, `${path}${node.val}->`);
    }
    if (node.right) {
      this.dfs(node.right, paths, `${path}${node.val}->`);
    }
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
