import TreeNode from '../concepts/tree-node';

class Problem {
  levelOrder(root: TreeNode | undefined): number[][] {
    throw new Error(`Not implemented (${root}).`);
  }
}

class Default extends Problem {
  levelOrder(root: TreeNode | undefined): number[][] {
    const lists = [];
    if (!root) {
      return lists;
    }

    const queue = [root];
    while (queue.length > 0) {
      const size = queue.length;
      const level = [];
      for (let i = 0; i < size; i++) {
        const current = queue.shift();
        level.push(current.value);
        if (current.left) {
          queue.push(current.left);
        }
        if (current.right) {
          queue.push(current.right);
        }
      }
      lists.push(level);
    }
    return lists;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
