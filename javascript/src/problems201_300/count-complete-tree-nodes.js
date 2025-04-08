class Problem {
  countNodes(root) {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  countNodes(root) {
    if (!root) {
      return 0;
    }
    let count = 0;
    const queue = [];
    queue.push(root);
    while (queue.length > 0) {
      const node = queue.shift();
      count++;
      if (node.left) {
        queue.push(node.left);
      }
      if (node.right) {
        queue.push(node.right);
      }
    }
    return count;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
