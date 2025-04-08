class Problem {
  lowestCommonAncestor(root, p, q) {
    throw new Error(`Not implemented (${root}, ${p}, ${q}).`);
  }
}

class Default extends Problem {
  lowestCommonAncestor(root, p, q) {
    if (!p || !q) {
      return undefined;
    }
    let current = root;
    while (current) {
      if (current.val > p.val && current.val > q.val) {
        current = current.left;
      } else if (current.val < p.val && current.val < q.val) {
        current = current.right;
      } else {
        break;
      }
    }
    return current;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
