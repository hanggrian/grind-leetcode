class Problem {
  isSymmetric(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  isSymmetric(root) {
    return !root ||
        this.recursiveIsSymmetric(root.left, root.right);
  }

  recursiveIsSymmetric(node1, node2) {
    if (!node1 && !node2) {
      return true;
    }
    if (!node1 || !node2) {
      return false;
    }
    return node1.val === node2.val &&
        this.recursiveIsSymmetric(node1.left, node2.right) &&
        this.recursiveIsSymmetric(node1.right, node2.left);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
