class Problem {
  rightSideView(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  rightSideView(root) {
    const result = [];
    this.dfs(root, result, 0);
    return result;
  }

  dfs(node, list, level) {
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
