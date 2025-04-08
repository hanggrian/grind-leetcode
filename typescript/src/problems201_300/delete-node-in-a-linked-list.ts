import SinglyListNode from '../concepts/singly-list-node';

class Problem {
  deleteNode(node: SinglyListNode) {
    throw new Error(`Not implemented (${node}).`);
  }
}

class Default extends Problem {
  deleteNode(node: SinglyListNode) {
    if (!node) {
      return;
    }
    const next: SinglyListNode = node.next;
    node.val = next.val;
    node.next = next.next;
  }
}

const SOLUTIONS = [new Default()];
export default SOLUTIONS;
