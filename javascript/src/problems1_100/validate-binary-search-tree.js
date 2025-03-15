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
    if (left && node.value <= left) {
      return false;
    }
    if (right && node.value >= right) {
      return false;
    }
    return this.recursiveValid(node.left, left, node.value) &&
        this.recursiveValid(node.right, node.value, right);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
