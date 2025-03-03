import {SinglyListNode} from '../concepts/list-nodes';

class Problem {
  addTwoNumbers(l1: SinglyListNode, l2: SinglyListNode): SinglyListNode {
    throw new Error(`'Not implemented (${l1}, ${l2}).`);
  }
}

class Default extends Problem {
  addTwoNumbers(l1: SinglyListNode, l2: SinglyListNode): SinglyListNode {
    let root = new SinglyListNode();
    let node = root;
    let carry = 0;
    while (l1 || l2) {
      // calculate total and carry
      let value = carry;
      if (l1) {
        value += l1.value;
        l1 = l1.next;
      }
      if (l2) {
        value += l2.value;
        l2 = l2.next;
      }
      carry = Math.floor(value / 10);

      // create list
      node.next = new SinglyListNode(value % 10);
      node = node.next;
    }
    // create remaining carry
    if (carry > 0) {
      node.next = new SinglyListNode(carry);
    }
    return root.next;
  }
}

export const SOLUTIONS = [new Default()];
