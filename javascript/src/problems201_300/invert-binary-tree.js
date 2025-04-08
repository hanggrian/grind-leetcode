class Problem {
  invertTree(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  invertTree(root) {
    if (!root) {
      return undefined;
    }
    const temp = root.left;
    root.left = this.invertTree(root.right);
    root.right = this.invertTree(temp);
    return root;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
