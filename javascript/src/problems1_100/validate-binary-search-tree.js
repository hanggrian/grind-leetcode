class Problem {
  isValidBst(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  isValidBst(root) {
    return this.recursiveValid(root, undefined, undefined);
  }

  recursiveValid(node, left, right) {
    if (!node) {
      return true;
    }
    if (left && node.val <= left) {
      return false;
    }
    if (right && node.val >= right) {
      return false;
    }
    return this.recursiveValid(node.left, left, node.val) &&
        this.recursiveValid(node.right, node.val, right);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
