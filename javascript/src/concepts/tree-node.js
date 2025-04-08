import Node from './node';

export default class TreeNode extends Node {
  constructor(val, left = undefined, right = undefined) {
    super(val);
    this.left = left;
    this.right = right;
  }

  hasLeft() {
    return this.left !== undefined;
  }

  hasRight() {
    return this.right !== undefined;
  }

  isLeaf() {
    return this.left === undefined && this.right === undefined;
  }

  recursiveEquals(node1, node2) {
    if (!node1 && !node2) {
      return true;
    }
    if (!node1 || !node2) {
      return false;
    }
    return node1.val === node2.val
        && this.recursiveEquals(node1.left, node2.left)
        && this.recursiveEquals(node1.right, node2.right);
  }

  equals(other) {
    if (this === other) {
      return true;
    }
    if (!(other instanceof TreeNode)) {
      return false;
    }
    return this.recursiveEquals(this, other);
  }

  static of(...vals) {
    if (vals.length === 0) {
      return undefined;
    }
    const root = new TreeNode(vals[0]);
    const queue = [root];
    let i = 1;
    while (queue.length > 0) {
      const node = queue.shift();
      if (i < vals.length && vals[i]) {
        node.left = new TreeNode(vals[i]);
        queue.push(node.left);
      }
      i++;
      if (i < vals.length && vals[i]) {
        node.right = new TreeNode(vals[i]);
        queue.push(node.right);
      }
      i++;
    }
    return root;
  }
}
