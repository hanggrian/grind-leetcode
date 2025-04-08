import TreeNode from '../concepts/tree-node';

class Problem {
  countNodes(root: TreeNode | undefined): number {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  countNodes(root: TreeNode | undefined): number {
    if (!root) {
      return 0;
    }
    let count: number = 0;
    const queue: TreeNode[] = [];
    queue.push(root);
    while (queue.length > 0) {
      const node: TreeNode = queue.shift();
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
