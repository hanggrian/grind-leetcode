class Problem {
  isSameTree(p, q) {
    throw new Error(`Not implemented (${p}, ${q}).`);
  }
}

class Default extends Problem {
  isSameTree(p, q) {
    if (!p && !q) {
      return true;
    }
    if (!p || !q) {
      return false;
    }
    if (p.value !== q.value) {
      return false;
    }
    return this.isSameTree(p.left, q.left)
        && this.isSameTree(p.right, q.right);
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
