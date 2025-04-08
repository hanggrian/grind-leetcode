class Problem {
  binaryTreePaths(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  binaryTreePaths(root) {
    const paths = [];
    this.dfs(root, paths, '');
    return paths;
  }

  dfs(node, paths, path) {
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
