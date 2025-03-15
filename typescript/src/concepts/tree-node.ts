import Node from './node';

export default class TreeNode extends Node {
  left: TreeNode = undefined;
  right: TreeNode = undefined;

  constructor(
      value: number,
      left: TreeNode | undefined = undefined,
      right: TreeNode | undefined = undefined,
  ) {
    super(value);
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

  recursiveEquals(node1: TreeNode | undefined, node2: TreeNode | undefined): boolean {
    if (!node1 && !node2) {
      return true;
    }
    if (!node1 || !node2) {
      return false;
    }
    return node1.value === node2.value
        && this.recursiveEquals(node1.left, node2.left)
        && this.recursiveEquals(node1.right, node2.right);
  }

  equals(other: object): boolean {
    if (this === other) {
      return true;
    }
    if (!(other instanceof TreeNode)) {
      return false;
    }
    return this.recursiveEquals(this, other);
  }

  static of(...values: number[]): TreeNode | undefined {
    if (values.length === 0) {
      return undefined;
    }
    const root = new TreeNode(values[0]);
    const queue = [root];
    let i = 1;
    while (queue.length > 0) {
      const node = queue.shift();
      if (i < values.length && values[i]) {
        node.left = new TreeNode(values[i]);
        queue.push(node.left);
      }
      i++;
      if (i < values.length && values[i]) {
        node.right = new TreeNode(values[i]);
        queue.push(node.right);
      }
      i++;
    }
    return root;
  }
}
